package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A084374 Numbers k such that the smallest digit of k = number of prime divisors of k (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A084374 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084374() {
    super(1, k -> {
      int syn = Functions.SYNDROME.i(k);
      if ((syn & 1) == 1) {
        return false;
      }
      final int s0 = Functions.BIG_OMEGA.i(k);
      if (s0 >= 10) {
        return false;
      }
      int j = 0;
      while ((syn & 1) == 0) {
        ++j;
        syn >>>= 1;
      }
      return j == s0;
    });
  }
}
