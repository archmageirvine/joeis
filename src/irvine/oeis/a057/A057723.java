package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057723 Sum of positive divisors of n that are divisible by every prime that divides n.
 * @author Sean A. Irvine
 */
public class A057723 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z rad = Jaguar.factor(++mN).squareFreeKernel();
    return rad.multiply(Functions.SIGMA.z(mN / rad.longValue()));
  }
}
