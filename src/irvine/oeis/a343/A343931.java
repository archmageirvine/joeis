package irvine.oeis.a343;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A343931 Numbers k such that Sum_{j=1..k} (-j)^j == 0 (mod k).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A343931 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A343931() {
    super(1, 1, k -> {
      long s = 0;
      for (long j = 1; j <= k; ++j) {
        s += LongUtils.modPow(k - j, j, k);
        s %= k;
      }
      return s == 0;
    });
  }
}
