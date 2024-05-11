package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A061911 Square root of the sum of the digits of k^2 when this sum is a square.
 * @author Sean A. Irvine
 */
public class A061911 extends A061910 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = Functions.DIGIT_SUM.l(Z.valueOf(++mN).square());
      if (Predicates.SQUARE.is(t)) {
        return Z.valueOf(LongUtils.sqrt(t));
      }
    }
  }
}
