package irvine.oeis.a030;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030426 a(n) = Fibonacci(prime(n)).
 * @author Sean A. Irvine
 */
public class A030426 extends A000040 {

  @Override
  public Z next() {
    return Fibonacci.fibonacci(super.next().intValueExact());
  }
}

