package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A395420 Numbers k = x + y such that there exists sigma(x) + sigma(y) = 3*(x+y).
 * @author Sean A. Irvine
 */
public class A395420 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395420() {
    super(1, 12, k -> {
      for (long x = 1; 2 * x <= k; ++x) {
        if (Functions.SIGMA1.l(x) + Functions.SIGMA1.l(k - x) == 3 * k) {
          return true;
        }
      }
      return false;
    });
  }
}
