package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A395419 Numbers k = x + y, such that sigma(x) + sigma(y) = 2*(x+y).
 * @author Sean A. Irvine
 */
public class A395419 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395419() {
    super(1, 12, k -> {
      for (long x = 1; 2 * x <= k; ++x) {
        if (Functions.SIGMA1.l(x) + Functions.SIGMA1.l(k - x) == 2 * k) {
          return true;
        }
      }
      return false;
    });
  }
}
