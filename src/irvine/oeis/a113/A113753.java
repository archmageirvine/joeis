package irvine.oeis.a113;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A113753 a(n) = Fibonacci(n-1) + prime(n).
 * @author Georg Fischer
 */
public class A113753 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(mN - 1).add(super.next());
  }
}
