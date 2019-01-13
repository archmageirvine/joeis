package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001917.
 * @author Sean A. Irvine
 */
public class A001917 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  private long findMinimum(final Z p) {
    Z r = Z.TWO;
    long v = 1;
    while (!Z.ONE.equals(r)) {
      r = r.multiply2().mod(p);
      ++v;
    }
    return v;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return mP.subtract(1).divide(findMinimum(mP));
  }
}
