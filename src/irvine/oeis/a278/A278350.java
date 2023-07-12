package irvine.oeis.a278;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A278350 Cototient of Fibonacci(n).
 * @author Georg Fischer
 */
public class A278350 extends A000045 {

  private int mN = 0;

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    // a(n) = fibonacci(n) - eulerphi(fibonacci(n));
    ++mN;
    final Z fib = super.next();
    return fib.subtract(Euler.phi(fib));
  }
}
