package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006429 Number of tree-rooted planar maps with 4 vertices and n faces.
 * @author Sean A. Irvine
 */
public class A006429 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(13)
      .multiply(mN).add(294)
      .multiply(mN).add(2790)
      .multiply(mN).add(9408)
      .multiply(mN).subtract(903)
      .multiply(mN).subtract(83454)
      .multiply(mN).subtract(95500)
      .multiply(mN).add(194712)
      .multiply(mN).add(275040)
      .multiply(mN).divide(60480);
  }
}
