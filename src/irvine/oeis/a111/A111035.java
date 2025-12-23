package irvine.oeis.a111;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A111035 Numbers k that divide the sum of the first k nonzero Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A111035 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Fibonacci.fibonacci(++mN + 2, mN) == 1 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

