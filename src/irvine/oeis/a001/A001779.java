package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001779 Expansion of 1/((1+x)(1-x)^8).
 * @author Sean A. Irvine
 */
public class A001779 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(108)
      .multiply(mN).add(1138)
      .multiply(mN).add(5904)
      .multiply(mN).add(15628)
      .multiply(mN).add(19638)
      .multiply(mN).add(8925)
      .multiply(mN.multiply2().add(9))
      .add(mN.isEven() ? 315 : -315)
      .divide(80640);
  }
}
