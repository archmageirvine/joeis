package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001779.
 * @author Sean A. Irvine
 */
public class A001779 implements Sequence {

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
