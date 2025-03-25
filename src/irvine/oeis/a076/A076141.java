package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076141 Number of times n occurs as a binary sub-pattern of n^2.
 * @author Sean A. Irvine
 */
public class A076141 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mMask = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE;
    }
    if (mN.compareTo(mMask) > 0) {
      mMask = mMask.setBit(mMask.bitLength());
    }
    long cnt = 0;
    Z s = mN.square();
    while (s.compareTo(mN) >= 0) {
      if (s.and(mMask).equals(mN)) {
        ++cnt;
      }
      s = s.divide2();
    }
    return Z.valueOf(cnt);
  }
}
