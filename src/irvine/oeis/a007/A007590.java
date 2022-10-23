package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007590 a(n) = floor(n^2/2).
 * @author Sean A. Irvine
 */
public class A007590 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide2();
  }
}
