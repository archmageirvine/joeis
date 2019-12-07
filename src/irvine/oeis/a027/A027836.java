package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027836 Total number of vertices in loopless rooted planar maps (with <code>n-1</code> edges).
 * @author Sean A. Irvine
 */
public class A027836 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4 * mN - 1).multiply(2 * mN - 1).multiply(4 * mN - 3).multiply(5 * mN * mN + 13 * mN + 2).multiply(8)
        .divide(5 * mN * mN + 3 * mN - 6).divide(3 * mN + 3).divide(3 * mN + 2).divide(3 * mN + 1);
    }
    return mA;
  }
}
