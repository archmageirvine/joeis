package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Number of antidivisors of n that do not divide n.
 * @author Sean A. Irvine
 */
public class Antisigma0 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    long c = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isOdd()) {
        ++c;
      }
    }
    final Z n2 = n.multiply2();
    final Z s0 = Functions.SIGMA0.z(n2.subtract(1));
    final Z s1 = Functions.SIGMA0.z(n2.add(1));
    return s0.add(s1).add(c - 5).max(Z.ZERO);
  }
}
