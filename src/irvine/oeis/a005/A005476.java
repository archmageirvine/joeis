package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005476 a(n) = n*(5*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A005476 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).subtract(1).multiply(mN).divide2();
  }
}
