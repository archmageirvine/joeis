package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006001 Number of paraffins.
 * @author Sean A. Irvine
 */
public class A006001 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(5).multiply(mN).add(2).divide2();
  }
}
