package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002059 Number of partitions of a n-gon into (n-4) parts.
 * @author Sean A. Irvine
 */
public class A002059 implements Sequence {

  private long mN = 5;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN > 6) {
      final Z ns = Z.valueOf(mN).square();
      mA = mA.multiply(ns.multiply(mN).multiply2().subtract(ns.multiply(19)).add(60 * mN - 63).multiply2()).divide(mN).divide(mN - 4).divide(mN - 6);
    }
    return mA;
  }
}
