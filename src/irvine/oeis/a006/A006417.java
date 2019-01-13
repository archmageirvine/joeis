package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006417.
 * @author Sean A. Irvine
 */
public class A006417 implements Sequence {

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
