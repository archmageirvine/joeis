package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005370 a(n) = Fibonacci(Fibonacci(n+1) + 1).
 * @author Sean A. Irvine
 */
public class A005370 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(Fibonacci.fibonacci(++mN).intValueExact() + 1);
  }
}
