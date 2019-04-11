package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002621 Expansion of <code>1 / ((1-x)^2*(1-x^2)*(1-x^3)*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A002621 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(21).multiply(mN).add(145).multiply(mN).add(350).signedAdd(mN.isEven(), Z.NINE).multiply(mN.add(1)).add(575).divide(576);
  }
}
