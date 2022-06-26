package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057723 Sum of positive divisors of n that are divisible by every prime that divides n.
 * @author Sean A. Irvine
 */
public class A057723 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z rad = Jaguar.factor(++mN).squareFreeKernel();
    return rad.multiply(Jaguar.factor(mN / rad.longValue()).sigma());
  }
}
