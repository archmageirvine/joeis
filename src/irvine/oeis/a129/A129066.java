package irvine.oeis.a129;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A094396 Numbers k such that k divides the (k-1)st Lucas number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A129066 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return n % 12 != 0 && Fibonacci.fibonacci(n, n) == 0;
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
