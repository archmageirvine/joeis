package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;

/**
 * A000687.
 * @author Sean A. Irvine
 */
public class A000687 extends A000674 {

  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : Fibonacci.fibonacci(n - 1);
  }
}
