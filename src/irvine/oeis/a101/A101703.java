package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A083812 Numbers k such that 4*k-1 is the digit reversal of k-1.
 * @author Sean A. Irvine
 */
public class A101703 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A101703() {
    super(1, n -> {
      if (n % 3 != 0) {
        return false;
      }
      final long r = Functions.REVERSE.l(n);
      return r == (n / 3) * 2 - 2;
    });
  }
}
