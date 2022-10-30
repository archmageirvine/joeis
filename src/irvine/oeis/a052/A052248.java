package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A052248 Greatest prime divisor of all composite numbers between p and next prime.
 * @author Sean A. Irvine
 */
public class A052248 extends A065091 {

  {
    setOffset(2);
  }

  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    Z max = Z.ONE;
    while (!s.equals(mP)) {
      final Z[] factors = Jaguar.factor(s).toZArray();
      max = max.max(factors[factors.length - 1]);
      s = s.add(1);
    }
    return max;
  }
}
