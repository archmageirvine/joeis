package irvine.oeis.a135;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A135970 Fibonacci(Mersenne primes): a(n) = Fibonacci(A000668(n)).
 * @author Georg Fischer
 */
public class A135970 extends A000668 {

  @Override
  public Z next() {
    return Fibonacci.fibonacci(super.next().intValue());
  }
}
