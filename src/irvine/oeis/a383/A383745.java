package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383745 allocated for Huaineng He.
 * @author Sean A. Irvine
 */
public class A383745 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).multiply(mN + 1);
      if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(t) * 4 + 1)) {
        return t;
      }
    }
  }
}

