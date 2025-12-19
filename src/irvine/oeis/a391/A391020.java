package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391020 allocated for Hermann Stamm-Wilbrandt.
 * @author Sean A. Irvine
 */
public class A391020 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mProd = Z.ONE;
  private long mN = -1;
  private long mP = 1;

  private boolean is(final Z prod, final long p) {
    for (long q = 2; q <= p; q = mPrime.nextPrime(q)) {
      if (prod.divide(q).add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      mProd = mProd.multiply(mP);
      if (is(mProd, mP)) {
        return Z.valueOf(mN);
      }
    }
  }
}
