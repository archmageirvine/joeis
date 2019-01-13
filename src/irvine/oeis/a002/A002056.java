package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002056.
 * @author Sean A. Irvine
 */
public class A002056 implements Sequence {

  private long mN = 5;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 6) {
      final Z ns = Z.valueOf(mN).square();
      mA = mA.multiply(ns.multiply(mN).multiply2().subtract(ns.multiply(21)).add(73 * mN - 84).multiply2()).divide(mN - 1).divide(mN - 5).divide(mN - 6);
    }
    return mA;
  }
}
