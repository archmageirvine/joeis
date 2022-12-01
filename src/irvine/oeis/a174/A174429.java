package irvine.oeis.a174;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a008.A008908;

/**
 * A174429 Collatz-Fibonacci numbers: a(1) = a(2) = 1; if n &gt; 2, a(n) = a(C(n)) + a(C(C(n))), where  C(n) = A006370(n).
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
