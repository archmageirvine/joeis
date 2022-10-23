package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001781 Expansion of 1/((1+x)*(1-x)^10).
 * @author Sean A. Irvine
 */
public class A001781 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(88)
      .multiply(mN).add(1616)
      .multiply(mN).add(16060)
      .multiply(mN).add(93656)
      .multiply(mN).add(324808)
      .multiply(mN).add(646236)
      .multiply(mN).add(663894)
      .multiply(mN).add(263655)
      .multiply(mN.multiply2().add(11))
      .add(mN.isEven() ? 2835 : -2835)
      .divide(2903040);
  }
}
