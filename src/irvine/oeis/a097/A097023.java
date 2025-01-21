package irvine.oeis.a097;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097023 Numbers k such that the sum of the divisors of 2*k^2 is a square.
 * @author Sean A. Irvine
 */
public class A097023 extends Sequence1 {

  private long mN = 312;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(Functions.SIGMA1.z(Z.valueOf(++mN).square().multiply2()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
