package irvine.oeis.a113;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A113753 Fibonacci(n+1) + prime(n).
 * @author Georg Fischer
 */
public class A113753 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN - 1).add(super.next());
  }
}
