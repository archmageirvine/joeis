package irvine.oeis.a006;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A006308 Coefficients of period polynomials.
 * @author Sean A. Irvine
 */
public class A006308 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006308(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006308() {
    super(2);
  }

  private static final PolynomialRing<CR> RING = new PolynomialRing<>(ComputableReals.SINGLETON);

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final Fast mPrime = new Fast();
  protected int mP = 2;

  protected static CR etaStar(final int p, final int q, final int i) {
    CC sum = CC.ZERO;
    final CC zeta = ComputableComplexField.SINGLETON.exp(new CC(CR.ZERO, CR.TAU.divide(CR.valueOf(p * p))));
    final int p2 = p * p;
    long qq = 1;
    for (int v = 0; v < p - 1; ++v) {
      final int e = (int) (((q + i * (long) p) * qq) % p2);
      sum = ComputableComplexField.SINGLETON.add(sum, ComputableComplexField.SINGLETON.pow(zeta, e));
      qq *= q;
      qq %= p2;
    }
    return sum.re();
  }

  private Polynomial<CR> f(final int p, final int q) {
    Polynomial<CR> f = RING.one();
    for (int k = 0; k < p; ++k) {
      f = RING.multiply(f, RING.create(Arrays.asList(etaStar(p, q, k).negate(), CR.ONE)));
    }
    return f;
  }

  // The following version uses an actual rational ring extension and
  // delays the actual computation of zeta values until near the end.
  // It appears to be slower than the alternative
//  private static Polynomial<Q> etaStar(final RationalUnityExtension ext, final int p, final int q, final int i) {
//    Polynomial<Q> mSum = ext.zero();
//    final int p2 = ext.power();
//    assert p2 == p * p;
//    long qq = 1;
//    for (int v = 0; v < p - 1; ++v) {
//      final int e = (int) (((q + i * (long) p) * qq) % p2);
//      mSum = ext.add(mSum, ext.monomial(Q.ONE, e));
//      qq *= q;
//      qq %= p2;
//    }
//    return mSum;
//  }
//
//  private Polynomial<Polynomial<Q>> f2(final int p, final int q) {
//    final RationalUnityExtension ext = new RationalUnityExtension(p * p);
//    final PolynomialRing<Polynomial<Q>> ring = new PolynomialRing<>(ext);
//    Polynomial<Polynomial<Q>> f = ring.one();
//    for (int k = 0; k < p; ++k) {
//      f = ring.multiply(f, ring.create(Arrays.asList(etaStar(ext, p, q, k).negate(), ext.one())));
//    }
//    return f;
//  }
//
//  private Z coeff(final Polynomial<Polynomial<Q>> f, final int n, final int p) {
//    final Polynomial<Q> c = f.coeff(n);
//    CC mSum = CC.ZERO;
//    final CC zeta = ComputableComplexField.SINGLETON.exp(new CC(CR.ZERO, CR.TAU.divide(CR.valueOf(p * p))));
//    CC z = CC.ONE;
//    for (int k = 0; k <= c.degree(); ++k) {
//      if (!c.coeff(k).equals(Q.ZERO)) {
//        mSum = ComputableComplexField.SINGLETON.add(mSum, ComputableComplexField.SINGLETON.multiply(z, CR.valueOf(c.coeff(k))));
//      }
//      z = ComputableComplexField.SINGLETON.multiply(z, zeta);
//    }
//    return mSum.re().toZ();
//  }

  protected int coeffNumber() {
    return mP - 2;
  }

  protected Z sign(final Z n) {
    return n.negate();
  }

  @Override
  public Z next() {
    mP = (int) mPrime.nextPrime(mP);
    final long p2 = mP * mP;
    final Z g = ZUtils.leastPrimitiveRoot(Z.valueOf(p2));
    final int q = g.modPow(Z.valueOf(mP), Z.valueOf(p2)).intValueExact();
    final Polynomial<CR> f = f(mP, q);
    if (mVerbose) {
      System.out.println("f(" + mP + ")=" + f);
    }
    return sign(f.coeff(coeffNumber()).toZ());
//    final Polynomial<Polynomial<Q>> f2 = f2(mP, q);
//    if (mVerbose) {
//      System.out.println("f(" + mP + ")=" + f2);
//    }
//    return coeff(f2, mP - 2, mP).negate();
  }
}

