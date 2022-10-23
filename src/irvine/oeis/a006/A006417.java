package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006417 Number of loopless rooted planar maps with 4 faces and n vertices and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006417 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply2().add(39)
      .multiply(mN).add(125)
      .multiply(mN).subtract(345)
      .multiply(mN).subtract(1027)
      .multiply(mN).add(846)
      .multiply(mN).add(2160)
      .divide(360);
  }
}
