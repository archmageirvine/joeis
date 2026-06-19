package irvine.oeis.a085;

import irvine.oeis.FilterNumberSequence;

/**
 * A085477 Numbers n such that there is at least one k dividing (n-1)!-1 (n&lt;=k&lt;=2n).
 * @author Sean A. Irvine
 */
public class A085477 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085477() {
    super(1, 1, m -> {
      for (long k = m; k <= 2 * m; ++k) {
        long f = 1;
        for (long j = 2; j < m && f != 0; ++j) {
          f *= j;
          f %= k;
        }
        if (f == 1) {
          return true;
        }
      }
      return false;
    });
  }
}
