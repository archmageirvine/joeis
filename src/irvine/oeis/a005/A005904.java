package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005904 Centered dodecahedral numbers.
 * @author Sean A. Irvine
 */
public class A005904 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).add(5).multiply(mN).add(1).multiply(mN.multiply2().add(1));
  }
}
