package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A084373 Numbers k such that smallest digit of k = total number of divisors of k.
 * @author Sean A. Irvine
 */
public class A084373 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084373() {
    super(1, k -> {
      int syn = Functions.SYNDROME.i(k);
      if ((syn & 1) == 1) {
        return false;
      }
      final long s0 = Functions.SIGMA0.l(k);
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
