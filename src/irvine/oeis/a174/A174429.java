package irvine.oeis.a174;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a008.A008908;

/**
 * A174429 a(n) = Fibonacci(A008908(n))
 * @author Georg Fischer
 */
public class A174429 extends A008908 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(super.next().intValue());
  }
}
