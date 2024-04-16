package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062348 a(n) = n! / (number of distinct prime divisors of n).
 * @author Sean A. Irvine
 */
public class A062348 extends A000142 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return super.next().divide(Functions.OMEGA.i(mN));
  }
}
