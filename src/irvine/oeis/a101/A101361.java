package irvine.oeis.a101;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A101361 a(1) = a(2) = 1; for n &gt; 2, a(n) = Knuth's Fibonacci (or circle) product "a(n-1) o a(n-2)".
 * @author Georg Fischer
 */
public class A101361 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = Fibonacci(2*Fibonacci(n)).
    ++mN;
    return Fibonacci.fibonacci(Fibonacci.fibonacci(mN).intValue() * 2);
  }
}
