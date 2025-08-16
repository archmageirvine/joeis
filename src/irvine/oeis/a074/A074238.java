package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074238 Numbers k such that the sum of the reverses of 1,2,...,k is a perfect square.
 * @author Sean A. Irvine
 */
public class A074238 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Functions.REVERSE.l(++mN));
      if (Predicates.SQUARE.is(mSum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
