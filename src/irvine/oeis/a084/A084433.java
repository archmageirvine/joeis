package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A084433 Numbers whose cyclic permutations have GCD &gt; 1.
 * @author Sean A. Irvine
 */
public class A084433 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084433() {
    super(1, k -> {
      long gcd = k;
      final String s = String.valueOf(k);
      for (int i = 1; i < s.length() && gcd != 1; ++i) {
        final long j = Long.parseLong(s.substring(i) + s.substring(0, i));
        gcd = Functions.GCD.l(gcd, j);
      }
      return gcd > 1;
    });
  }
}
