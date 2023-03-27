package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062358 a(n) = n! / number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062358 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().divide(Jaguar.factor(mN).sigma0());
  }
}
