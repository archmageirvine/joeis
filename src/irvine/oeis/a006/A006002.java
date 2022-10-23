package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006002 a(n) = n*(n+1)^2/2.
 * @author Sean A. Irvine
 */
public class A006002 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z n = mN;
    mN = mN.add(1);
    return mN.square().multiply(n).divide2();
  }
}
