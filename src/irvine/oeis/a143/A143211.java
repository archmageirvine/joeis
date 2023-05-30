package irvine.oeis.a143;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143211 Triangle read by rows, T(n,k) = F(n)*F(k); 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143211 extends BaseTriangle {

  /** Construct the sequence. */
  public A143211() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Fibonacci.fibonacci(n).multiply(Fibonacci.fibonacci(k));
  }
}
