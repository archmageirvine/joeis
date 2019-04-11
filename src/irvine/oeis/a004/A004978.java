package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a002.A002048;

/**
 * A004978 a(n)=least number m such that m-a(n-1) <code>!=</code> a(j)-a(k) for all j,k less than n; <code>a(1)=1, a(2)=2</code>.
 * @author Sean A. Irvine
 */
public class A004978 extends A002048 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(super.next());
    return mA;
  }
}
