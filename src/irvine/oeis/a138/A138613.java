package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A138613 <code>a(n) = sigma_2(a(n-1))</code>: sum of squares of divisors of <code>a(n-1)</code> with <code>a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A138613 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : Jaguar.factor(mA).sigma2();
    return mA;
  }
}
