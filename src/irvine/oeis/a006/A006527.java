package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006527 a(n) = (n^3 + 2*n)/3.
 * @author Sean A. Irvine
 */
public class A006527 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(mN.multiply2()).divide(3);
  }
}
