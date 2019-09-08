package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025557 <code>a(n) = (n+1)!/LCM{1,3,6,...,C(n+1,2)}</code>.
 * @author Sean A. Irvine
 */
public class A025557 extends A025555 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.divide(super.next());
  }
}
