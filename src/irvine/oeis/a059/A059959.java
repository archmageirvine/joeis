package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059959 Distance of 2^n from its nearest prime neighbor and in case of a tie, choose the smaller.
 * @author Sean A. Irvine
 */
public class A059959 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.NEG_ONE;
    }
    mA = mA.multiply2();
    if (mA.equals(Z.TWO)) {
      return Z.ZERO;
    }
    final Z prev = mPrime.prevPrime(mA);
    final Z next = mPrime.nextPrime(mA);
    if (next.subtract(mA).compareTo(mA.subtract(prev)) < 0) {
      return mA.subtract(next);
    } else {
      return mA.subtract(prev);
    }
  }
}
