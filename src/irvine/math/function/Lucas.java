package irvine.math.function;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * Lucas function.
 * @author Sean A. Irvine
 */
class Lucas extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Fibonacci.fibonacci(n - 1).add(Fibonacci.fibonacci(n + 1));
  }
}
