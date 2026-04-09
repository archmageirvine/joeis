package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A393129 Numbers k such that there is a reversible prime of the form 10^k - 2*10^m - 1.
 * @author Sean A. Irvine
 */
public class A393129 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393129() {
    super(1, n -> {
      final Z r = Z.TEN.pow(n).subtract(1);
      Z mt = Z.TWO;
      for (long m = 0; m < n; ++m) {
        final Z t = r.subtract(mt);
        if (t.isProbablePrime() && Functions.REVERSE.z(t).isProbablePrime()) {
          return true;
        }
        mt = mt.multiply(10);
      }
      return false;
    });
  }
}
