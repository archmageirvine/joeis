package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001780 Expansion of 1/((1+x)(1-x)^9).
 * @author Sean A. Irvine
 */
public class A001780 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(80)
      .multiply(mN).add(1344)
      .multiply(mN).add(12320)
      .multiply(mN).add(66948)
      .multiply(mN).add(218960)
      .multiply(mN).add(416176)
      .multiply(mN).add(413760)
      .multiply(mN).add(160965)
      .add(mN.isEven() ? 315 : -315)
      .divide(161280);
  }
}
