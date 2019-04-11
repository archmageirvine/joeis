package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001769 Expansion of <code>1/((1+x)*(1-x)^7)</code>.
 * @author Sean A. Irvine
 */
public class A001769 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(96)
      .multiply(mN).add(910)
      .multiply(mN).add(4320)
      .multiply(mN).add(10696)
      .multiply(mN).add(12864)
      .multiply(mN)
      .divide(5760)
      .add(1);
  }
}
