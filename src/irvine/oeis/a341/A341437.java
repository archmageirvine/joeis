package irvine.oeis.a341;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A341437 Numbers k such that k divides Sum_{j=0..k} j^(k-j).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A341437 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A341437() {
    super(1, 1, k -> {
      long s = 0;
      for (long j = 0; j <= k; ++j) {
        s += LongUtils.modPow(j, k - j, k);
        s %= k;
      }
      return s == 0;
    });
  }
}
