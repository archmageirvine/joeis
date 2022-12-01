package irvine.oeis.a339;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A339572 If n even, a(n) = A000071(n/2+1); if n odd, a(n) = A001610((n-1)/2).
 * @author Georg Fischer
 */
public class A339572 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(n) = Fibonacci(k+2) + Fibonacci(k)*(n mod 2) - 1, where k = floor(n/2).
    ++mN;
    final int k = mN / 2;
    return Fibonacci.fibonacci(k + 2).add(Fibonacci.fibonacci(k).multiply(mN & 1)).subtract(1);
  }
}
