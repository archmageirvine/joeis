package irvine.oeis.a114;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A114185 a(n) = Fibonacci(2*n) - n - 1.
 * @author Georg Fischer
 */
public class A114185 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(2L * mN).subtract(mN + 1);
  }
}
