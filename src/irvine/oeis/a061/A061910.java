package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061910 Positive numbers k such that sum of digits of k^2 is a square.
 * @author Sean A. Irvine
 */
public class A061910 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(Z.valueOf(++mN).square()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
