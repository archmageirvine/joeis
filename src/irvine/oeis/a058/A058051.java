package irvine.oeis.a058;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058051 a(n) = F(F(F(n))), where F is a Fibonacci number (A000045).
 * @author Sean A. Irvine
 */
public class A058051 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(Fibonacci.fibonacci(Fibonacci.fibonacci(++mN).intValueExact()).intValueExact());
  }
}
