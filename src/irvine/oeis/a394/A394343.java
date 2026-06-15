package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394343 Numbers k &gt;= 2 not expressible as (x*y + gcd(x-1,y-1) + 1)/2 with x, y &gt;= 3.
 * @author Sean A. Irvine
 */
public class A394343 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394343() {
    super(1, 2, n -> {
      final long t = 2 * n - 1;
      for (long k = 3; k < n; ++k) {
        for (long j = 3; j <= k; ++j) {
          if (k * j + Functions.GCD.l(k - 1, j - 1) == t) {
            return false;
          }
          if (k * j > t + k) {
            break;
          }
        }
      }
      return true;
    });
  }
}
