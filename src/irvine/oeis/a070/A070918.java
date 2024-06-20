package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070918 Triangle of T(n,k) coefficients of polynomials with first n prime numbers as roots.
 * @author Sean A. Irvine
 */
public class A070918 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mPoly = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mPoly = RING.one();
      for (long k = 0, p = 2; k < mN; ++k, p = mPrime.nextPrime(p)) {
        mPoly = RING.multiply(mPoly, Polynomial.create(-p, 1), mN);
      }
    }
    return mPoly.coeff(mM);
  }
}
