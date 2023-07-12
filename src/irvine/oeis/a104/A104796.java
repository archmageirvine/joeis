package irvine.oeis.a104;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A104796 Triangle read by rows: T(n,k) = (n+1-k)*Fibonacci(n+2-k), for n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A104796 extends Triangle {

  /** Construct the sequence. */
  public A104796() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return n == 1 ? Z.ONE : Fibonacci.fibonacci(n + 2 - k).multiply(n + 1 - k);
  }
}
