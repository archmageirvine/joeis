package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062358 a(n) = n! / d(n), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062358 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().divide(Functions.SIGMA0.z(mN));
  }
}
