package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007742 a(n) = n*(4*n+1).
 * @author Sean A. Irvine
 */
public class A007742 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.multiply(4).add(1));
  }
}
