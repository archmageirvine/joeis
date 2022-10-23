package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051613 a(n) = partitions of n into powers of distinct primes (1 not considered a power).
 * @author Sean A. Irvine
 */
public class A051613 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mS = 1;
  private int mN = -1;
  private Polynomial<Z> mGf = RING.one();

  @Override
  public Z next() {
    if (++mN > mS) {
      mS *= 10;
      mGf = RING.one();
      for (long p = 2; p < mS; p = mPrime.nextPrime(p)) {
        final long[] c = new long[mS];
        c[0] = 1;
        for (int k = (int) p; k < c.length; k *= p) {
          c[k] = 1;
        }
        mGf = RING.multiply(mGf, Polynomial.create(c));
      }
    }
    return mGf.coeff(mN);
  }
}
