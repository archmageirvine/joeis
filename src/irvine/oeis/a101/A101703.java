package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A101703 Numbers n such that reversal(n) = (2/3)*n - 2.
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
