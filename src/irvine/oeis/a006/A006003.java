package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006003 a(n) = n*(n^2 + 1)/2.
 * @author Sean A. Irvine
 */
public class A006003 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).multiply(mN).divide2();
  }
}
