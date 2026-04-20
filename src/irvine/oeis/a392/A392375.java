package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392375 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A392375 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392375() {
    super(1, k -> {
      long m = k;
      long sum = 0;
      while (m != 0) {
        final long r = m % 10;
        if (Functions.GCD.l(k, r) != 1) {
          return false;
        }
        sum += r;
        m /= 10;
      }
      return Functions.GCD.l(k, sum) == 1;
    });
  }
}
