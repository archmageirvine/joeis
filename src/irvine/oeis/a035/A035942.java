package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035942 Number of partitions of n into distinct prime power parts (1 and <code>2</code> excluded).
 * @author Sean A. Irvine
 */
public class A035942 implements Sequence {

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
      for (long p = 3; p < mS; p = mPrime.nextPrime(p)) {
        final long[] c = new long[mS];
        c[0] = 1;
        for (int k = (int) p; k < c.length; k *= p) {
          c[k] = 1;
        }
        c[2] = 0;
        mGf = RING.multiply(mGf, Polynomial.create(c));
      }
    }
    return mGf.coeff(mN);
  }
}
