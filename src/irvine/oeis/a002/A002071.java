package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.AbstractIterator;

/**
 * A002071 Number of pairs of consecutive integers <code>x, x+1</code> such that all prime factors of both x and <code>x+1</code> are at most the n-th prime.
 * @author Sean A. Irvine
 */
public class A002071 implements Sequence {

  // Fundamentally this works using the Lehmer's improvements to Stormer's theorem
  // Implementation is based on the Python code by D. Eppstein.

  // Generate sequence of convergents h,k for sqrt(root).
  private static final class SquareRootConvergentsIterator extends AbstractIterator<Z[]> {
    private Z mH = Z.ONE;
    private Z mHH = Z.ZERO;
    private Z mK = Z.ZERO;
    private Z mKK = Z.ONE;
    private Z mA = Z.ZERO;
    private Z mB = Z.ONE;
    private final Z mC;
    private Z mD = Z.ONE;

    private static boolean tooBig(final Z a, final Z b, final Z c, final Z d, final Z x) {
      // Polynomial for which r is root
      final Z y = d.multiply(x).square().subtract(a.multiply(d).multiply(x).multiply2()).add(a.square()).subtract(b.square().multiply(c));
      return y.signum() > 0;
    }

    // Exact calculation of int(r), where r=(a + b sqrt(c))/d
    private static Z floorQuadraticIrrational(final Z a, final Z b, final Z c, final Z d) {
      // Get a starting point
      final Z x = a.add(b.multiply(c.sqrt())).divide(d);
      Z e = Z.ONE;
      Z lo, hi;
      if (tooBig(a, b, c, d, x)) {
        while (tooBig(a, b, c, d, x.subtract(e))) {
          e = e.multiply2();
        }
        lo = x.subtract(e);
        hi = x.subtract(e.divide2());
      } else {
        while (!tooBig(a, b, c, d, x.add(e))) {
          e = e.multiply2();
        }
        lo = x.add(e.divide2());
        hi = x.add(e);
      }
      while (hi.subtract(lo).compareTo(Z.ONE) > 0) {
        final Z mid = hi.add(lo).divide2();
        if (tooBig(a, b, c, d, mid)) {
          hi = mid;
        } else {
          lo = mid;
        }
      }
      return lo;
    }

    private SquareRootConvergentsIterator(final Z root) {
      mC = root;
    }

    @Override
    public boolean hasNext() {
      return true; // Infinite solutions
    }

    @Override
    public Z[] next() {
      final Z fqi = floorQuadraticIrrational(mA, mB, mC, mD);
      final Z t = mH.multiply(fqi).add(mHH);
      mHH = mH;
      mH = t;
      final Z u = mK.multiply(fqi).add(mKK);
      mKK = mK;
      mK = u;
      final Z[] res = {mH, mK};
      mA = mA.subtract(mD.multiply(fqi));
      final Z a = mA.multiply(mD);
      final Z b = mB.multiply(mD).negate();
      final Z d = mA.square().subtract(mB.square().multiply(mC));
      final Z g = a.gcd(b).gcd(d);
      mA = a.divide(g);
      mB = b.divide(g);
      mD = d.divide(g);
      return res;
    }
  }

  // Generare sequence of solutions x,y for x^2-d*y^2=1
  private static final class PellIterator extends AbstractIterator<Z[]> {
    private final Z mD;
    private Z mA = null;
    private Z mB = null;
    private Z mX = null;
    private Z mY = null;

    private PellIterator(final Z d) {
      mD = d;
    }

    @Override
    public boolean hasNext() {
      return true; // Infinite solutions
    }

    @Override
    public Z[] next() {
      if (mA == null) {
        // Use continued fraction only to get first solution
        final Iterator<Z[]> sqrtConvergents = new SquareRootConvergentsIterator(mD);
        while (true) {
          final Z[] xy = sqrtConvergents.next();
          if (Z.ONE.equals(xy[0].multiply(xy[0]).subtract(xy[1].multiply(xy[1]).multiply(mD)))) {
            mX = xy[0];
            mY = xy[1];
            mA = mX;
            mB = mY;
            return new Z[] {mA, mB};
          }
        }
      }
      final Z x = mA.multiply(mX).add(mB.multiply(mY).multiply(mD));
      final Z y = mB.multiply(mX).add(mA.multiply(mY));
      mX = x;
      mY = y;
      return new Z[] {mX, mY};
    }
  }

  private long mP = 1;
  private final ArrayList<Long> mPrimes = new ArrayList<>();
  private final Fast mPrime = new Fast();
  protected Z mLargestSolution = Z.ZERO;

  private static Z product(final Set<Long> s) {
    Z p = Z.ONE;
    for (final long v : s) {
      p = p.multiply(v);
    }
    return p;
  }

  private static boolean isSmooth(Z q, final Collection<Long> primes) {
    for (final long p : primes) {
      while (q.mod(p) == 0) {
        q = q.divide(p);
      }
    }
    return Z.ONE.equals(q);
  }

  private boolean isSingleton2(final Set<Long> s) {
    return Z.ONE.equals(s.size()) && s.iterator().next() == 2;
  }

  // Assume primes is sorted from smallest to largest, all distinct
  private long stormer(final List<Long> primes) {
    long numberOfSolutions = 0;
    final int nterms = Math.max(3, (primes.get(primes.size() - 1).intValue() + 1) >> 1);
    for (final Set<Long> s : new FiniteSet<>(primes).powerset()) {
      if (isSingleton2(s)) {
        continue; // skip empty cases
      }
      final Iterator<Z[]> it = new PellIterator(product(s).multiply2());
      for (int k = 0; k < nterms; ++k) {
        final Z[] xy = it.next();
        final Z y = xy[1];
        if (isSmooth(y, primes)) {
          ++numberOfSolutions;
          // This next part gets the actual solution
          final Z x = xy[0];
          final Z z = x.subtract(1).divide2(); // The lower of the pair
          // Remember the largest solution (needed for A002072
          if (z.compareTo(mLargestSolution) > 0) {
            mLargestSolution = z;
          }
        } else if (k == 0) {
          break;
        }
      }
    }
    return numberOfSolutions;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mPrimes.add(mP);
    return Z.valueOf(stormer(mPrimes));
  }
}
