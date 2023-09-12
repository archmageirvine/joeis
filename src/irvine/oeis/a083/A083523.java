package irvine.oeis.a083;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A083523 Smallest Fibonacci number divisible by 2^n.
 * @author Georg Fischer
 */
public class A083523 extends A000045 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.valueOf(mN + 1);
    }
    if (mN == 2) {
      return Z.EIGHT;
    }
    return Fibonacci.fibonacci(3L * (1L << (mN - 2)));
  }
}
