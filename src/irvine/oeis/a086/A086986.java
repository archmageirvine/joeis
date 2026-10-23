package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A086986 Numbers j such that sigma(j) can be represented as Sum_{i=0..k} sigma(m+i), with k&gt;0.
 * @author Sean A. Irvine
 */
public class A086986 extends FilterNumberSequence {

  // After Andrew Howroyd

  /** Construct the sequence. */
  public A086986() {
    super(1, n -> {
      final long m = Functions.SIGMA1.l(n);
      for (long k = 1; k <= m / 2; ++k) {
        long s = Functions.SIGMA1.l(k);
        long j = k;
        while (s < m) {
          s += Functions.SIGMA1.l(++j);
          if (s == m) {
            return true;
          }
        }
      }
      return false;
    });
  }
}

