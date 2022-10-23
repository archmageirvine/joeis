package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025527 a(n) = n!/lcm{1,2,...,n} = (n-1)!/lcm{C(n-1,0), C(n-1,1), ..., C(n-1,n-1)}.
 * @author Sean A. Irvine
 */
public class A025527 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mF = Z.ONE;
  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    mF = mF.multiply(mN);
    mL = mL.lcm(mN);
    return mF.divide(mL);
  }
}
