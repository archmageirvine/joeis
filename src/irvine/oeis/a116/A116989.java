package irvine.oeis.a116;
// manually 2025-08-03/lambdan at 2025-08-03 19:07

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A116989 Inverse Moebius transform of 6-simplex numbers A000579.
 * @author Georg Fischer
 */
public class A116989 extends LambdaSequence {

  /** Construct the sequence. */
  public A116989() {
    super(0, n -> outerSum(Binomial.binomial(n + 6, 6)));
  }

  private static Z outerSum(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Integers.SINGLETON.product(0, 5, k -> d.add(k)).divide(720));
    }
    return sum;
  }
}
