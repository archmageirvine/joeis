package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A384296 Square numbers whose iterative sums of digits are squares.
 * @author Sean A. Irvine
 */
public class A384296 extends Sequence1 {

  private final Sequence mSq = new A000290();

  private boolean is(final Z s) {
    if (!Predicates.SQUARE.is(s)) {
      return false;
    }
    return s.compareTo(Z.TEN) < 0 || is(Functions.DIGIT_SUM.z(s));
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mSq.next();
      if (is(s)) {
        return s;
      }
    }
  }
}

