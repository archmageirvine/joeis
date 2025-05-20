package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383745 Numbers k of the form x*(x+1) whose sum of digits is of the form y*(y+1).
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

