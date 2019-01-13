package irvine.factor.factor;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.factor.util.FactorBase;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.api.Matrix;
import irvine.math.matrix.BinaryMatrixFactory;
import irvine.math.matrix.DefaultBinaryMatrix;
import irvine.math.z.Z;

/**
 * Implements the quadratic sieve.
 *
 * @author Sean A. Irvine
 */
public class QuadraticSieve extends AbstractFactorizer {

  /** Chunking size for sieving regions. */
  private static final int BLOCK_SIZE = 1000000;

  private static double complexity(final Z n) {
    final double ln = n.ln();
    return Math.exp(0.5 * Math.sqrt(ln * Math.log(ln)));
  }

  /**
   * Set up a new quadratic sieve engine.
   */
  public QuadraticSieve() {
    // set vars to defaults
    mSqrtN = null;
    mTwoSqrtN = null;
    mRelations = null;
    mFactorBase = null;
  }

  private FactorBase mFactorBase;
  private Z mN, mSqrtN, mTwoSqrtN;
  /** Relations having residue logarithm less than this are retained from the sieve. */
  private int mThreshold;
  /** Smooth relations. x-&gt;factored(Q(x)). */
  private Map<Long, BitSet> mRelations;


  /**
   * Compute the value of q(x).
   *
   * @param x value to get quadratic for
   * @return q(x)
   */
  private Z q(final long x) {
    return mSqrtN.add(x).square().subtract(mN);
  }

  /**
   * Sieving. Sieve the range from low to high putting putative smooth
   * relations in a set.  It is not guaranteed that all smooth relations
   * in the desired range will be included or that all included relations
   * are indeed smooth; but overall it is likely to be reasonably accurate.
   *
   * @param low lowest x value
   * @param high highest x value
   * @return probable smooth relations
   * @exception IllegalArgumentException if <code>low</code> exceeds <code>high</code>
   * or <code>high</code> will cause an overflow or the sieving range is too large.
   */
  private Set<Long> sieve(final long low, final long high) {
    if (high < low) {
      throw new IllegalArgumentException("high must be >= low");
    }
    if ((((high << 1) + 1) ^ high) < 0) {
      throw new IllegalArgumentException("high " + high + " will overflow");
    }
    final long llen = high - low;
    if ((llen & ~0x7FFFFFFF) != 0) {
      throw new IllegalArgumentException("Sieve range exceeds 2^31");
    }
    final int len = (int) llen;

    // Initial size means less than 50% occupancy, should avoid the
    // need for hash table resizes behind the scenes
    final HashSet<Long> smooth = new HashSet<>(len << 1);

    // compute logs of q(x) and handle powers of 2
    Z qq = q(low);
    long k = (low << 1) + 1;
    final int[] logq = new int[len];
    for (int i = 0; i < len; ++i, k += 2) {
      logq[i] = qq.makeOdd().bitLength();
      qq = qq.add(mTwoSqrtN.add(k));
    }

    // handle other FB elements
    for (int i = mFactorBase.get(1) == 2 ? 2 : 1; i < mFactorBase.size(); ++i) {
      final int p = mFactorBase.get(i);
      final int logp = IntegerUtils.lg(p);

      /*
       * Adjust the start position taking account of the first Shanks
       * solution and the sieve region.  The Shanks solution should
       * be less than p.  It's a little tricky to make sure the
       * arithmetic handles both positive and negative regions here.
       */
      final int s1 = mFactorBase.getShanks1(i);
      assert s1 < p;
      final long shiftedLow1 = low - s1;
      final long delta1 = (low < 0 ? shiftedLow1 : shiftedLow1 + p - 1L) / p;
      int s = (int) (delta1 * p - shiftedLow1);
      assert s >= 0 && s - p < 0;

      // Sieve with the first solution.
      while (s < len) {
        logq[s] -= logp;
        s += p;
      }

      final int s2 = mFactorBase.getShanks2(i);
      if (s1 != s2) {
        /*
         * Adjust the start position taking account of the first Shanks
         * solution and the sieve region.  The Shanks solution should
         * be less than p.  It's a little tricky to make sure the
         * arithmetic handles both positive and negative regions here.
         */
        assert s2 < p;
        final long shiftedLow2 = low - s2;
        final long delta2 = (low < 0 ? shiftedLow2 : shiftedLow2 + p - 1L) / p;
        s = (int) (delta2 * p - shiftedLow2);
        assert s >= 0 && s - p < 0;

        // Sieve with the second solution.
        while (s < len) {
          logq[s] -= logp;
          s += p;
        }
      }
    }

    for (int i = 0; i < len; ++i) {
      if (logq[i] <= mThreshold) {
        smooth.add(i + low);
      }
    }
    return smooth;
  }

  private void factorSmoothRelations(final Set<Long> smooth) {
    for (final Long x : smooth) {
      final Z qx = q(x);
      final BitSet v = mFactorBase.factor(qx);
      if (v != null) {
        assert !v.isEmpty();
        mRelations.put(x, v);
      }
    }
  }

  private Set<Z> solveMatrix() {
    final long[] indexes = new long[mRelations.size()];
    final DefaultBinaryMatrix m = (DefaultBinaryMatrix) BinaryMatrixFactory.create(mRelations.size(), mFactorBase.size());
    int r = 0;
    for (final Map.Entry<Long, BitSet> e : mRelations.entrySet()) {
      indexes[r] = e.getKey();
      final BitSet b = e.getValue();
      // this is pretty ugly copy
      for (int k = 0; k < mFactorBase.size(); ++k) {
        m.set(r, k, b.get(k));
      }
      ++r;
    }
    message("Density: " + ((double) m.popcount() / m.rows() / m.cols()));
    final Matrix<Boolean> linear = m.linearDependencies(100);
    final Set<Z> factors = new HashSet<>();

    // test linear dependencies
    for (int i = 0; i < linear.rows(); ++i) {
      Z a = Z.ONE;
      Z b = Z.ONE;
      for (int k = 0; k < linear.cols(); ++k) {
        if (linear.get(i, k)) {
          final long x = indexes[k];
          b = b.multiply(mSqrtN.add(x));
          a = a.multiply(q(x));
        }
      }
      assert a.signum() >= 0;
      final Z[] sqrta = a.sqrtAndRemainder();
      assert Z.ZERO.equals(sqrta[1]);
      final Z gcd = b.subtract(sqrta[0]).abs().gcd(mN);
      if (!Z.ONE.equals(gcd) && !gcd.equals(mN)) {
        message("gcd = " + gcd);
        factors.add(gcd);
      }
    }

    return factors;
  }

  private void sieve() {
    final int target = mFactorBase.size() + 32;
    long block = 0;
    do {
      factorSmoothRelations(sieve(block * BLOCK_SIZE, (block + 1) * BLOCK_SIZE));
      factorSmoothRelations(sieve(-(block + 1) * BLOCK_SIZE, -block * BLOCK_SIZE));
      message("Sieved block " + block + " rels now " + mRelations.size());
      ++block;
    } while (mRelations.size() < target);
  }

  /**
   * Construct a quadratic sieve factoring engine.
   *
   * @param n number to factor.
   * @return array of factors.
   */
  public Set<Z> qsfactor(final Z n) {
    mN = n;
    mSqrtN = n.sqrt();
    mTwoSqrtN = mSqrtN.multiply2();
    final double c = complexity(n);
    message("Complexity: " + c);
    mFactorBase = new FactorBase(n, (int) c);
    message("|FB|: " + mFactorBase.size());
    mThreshold = n.bitLength() >>> 3;
    mRelations = new HashMap<>();
    sieve();
    return solveMatrix();
  }

  private static final Prime PRIME = new Fast();

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (Z.ONE.equals(n)) {
      return;
    }

    final Set<Z> factors = qsfactor(n);
    for (final Iterator<Z> i = factors.iterator(); i.hasNext() && !Z.ONE.equals(n);) {
      final Z f = i.next();
      if (PRIME.isPrime(f)) {
        while (Z.ZERO.equals(n.mod(f))) {
          n = n.divide(f);
          fs.add(f, FactorSequence.PROB_PRIME, exponent);
        }
        i.remove();
      }
    }
    // factors only has composites now
    // this is not perfect, should possibly take gcds among factors as well
    for (final Iterator<Z> i = factors.iterator(); i.hasNext() && !Z.ONE.equals(n);) {
      final Z f = i.next();
      final Z g = f.gcd(n);
      if (!Z.ONE.equals(g)) {
        n = n.divide(g);
        fs.add(g, FactorSequence.COMPOSITE, exponent);
      }
    }
    if (!Z.ONE.equals(n)) {
      fs.add(n, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("5437594367338124311187537"));
    qs.sieve();
    qs.solveMatrix();
    */

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("53890072253972793097798880549179"));
    qs.sieve();
    qs.solveMatrix();
    */

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("5389004414799487119565368376128168573607"));
    qs.sieve();
    qs.solveMatrix();
    */

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("538900722539727031058029009140426128087561"));
    qs.sieve();
    qs.solveMatrix();
    */

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("54375943673381243111875371"));
    qs.sieve();
    qs.solveMatrix();
    */

    /*
    final QuadraticSieve qs = new QuadraticSieve(new Z("104285561602250397121"));
    qs.sieve();
    qs.solveMatrix();
    */
    factorize(new QuadraticSieve(), args);
  }
}
