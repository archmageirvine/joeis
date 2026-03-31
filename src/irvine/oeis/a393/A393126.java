package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A393126 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A393126 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393126() {
    super(1, n -> {
      final Z r = Z.TEN.pow(n).subtract(1);
      Z mt = Z.ONE;
      for (long m = 1; m < (n + 1) / 2; ++m) {
        mt = mt.multiply(10);
        if (r.subtract(mt).isProbablePrime() && r.subtract(Z.TEN.pow(n - m - 1)).isProbablePrime()) {
          return true;
        }
      }
      return false;
    });
  }
}
