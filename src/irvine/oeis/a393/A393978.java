package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393978 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A393978 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393978() {
    super(1, 0, x -> {
      final long x2 = x * x;
      for (long y = 0, y2; (y2 = y * y) <= x2; ++y) {
        final long t = x2 - y2;
        if (Functions.DIGIT_SORT_DESCENDING.l(t) == Functions.DIGIT_SORT_DESCENDING.l(y2)) {
          return true;
        }
      }
      return false;
    });
  }
}
