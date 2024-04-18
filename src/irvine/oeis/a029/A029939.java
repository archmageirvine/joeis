package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029939 a(n) = Sum_{d|n} phi(d)^2.
 * @author Sean A. Irvine
 */
public class A029939 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.PHI.z(d).square());
    }
    return sum;
  }
}
