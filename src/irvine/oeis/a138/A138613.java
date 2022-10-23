package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138613 a(n) = sigma_2(a(n-1)): sum of squares of divisors of a(n-1) with a(1)=2.
 * @author Sean A. Irvine
 */
public class A138613 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : Jaguar.factor(mA).sigma2();
    return mA;
  }
}
