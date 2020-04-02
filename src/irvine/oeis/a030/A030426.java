package irvine.oeis.a030;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030426 <code>a(n) = Fibonacci(prime(n))</code>.
 * @author Sean A. Irvine
 */
public class A030426 extends A000040 {

  @Override
  public Z next() {
    return Fibonacci.fibonacci(super.next().intValueExact());
  }
}

