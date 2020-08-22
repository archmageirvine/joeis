package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025562 a(n) = n!/LCM{1, C(n-1,1), C(n-2,2), ..., C(n-[ n/2 ],[ n/2 ])}.
 * @author Sean A. Irvine
 */
public class A025562 extends A025560 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.divide(super.next());
  }
}
