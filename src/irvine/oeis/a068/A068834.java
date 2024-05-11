package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068834 Square such that the next three squares also having a square digit sum.
 * @author Sean A. Irvine
 */
public class A068834 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final Z p = Z.valueOf(++mN).square();
      if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(p))) {
        final Z q = Z.valueOf(mN + 1).square();
        if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(q))) {
          final Z r = Z.valueOf(mN + 2).square();
          if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(r))) {
            final Z s = Z.valueOf(mN + 3).square();
            if (Predicates.SQUARE.is(Functions.DIGIT_SUM.l(s))) {
              return p;
            }
          }
        }
      }
    }
  }
}
