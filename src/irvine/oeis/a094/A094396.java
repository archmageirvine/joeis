package irvine.oeis.a094;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A094396 Numbers k such that k divides the (k-1)st Lucas number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A094396 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return n == 1 || (Fibonacci.fibonacci(n - 2, n) + Fibonacci.fibonacci(n, n)) % n == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
