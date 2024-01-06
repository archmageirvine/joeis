package irvine.oeis.a094;

import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A094440 Triangular array read by rows: T(n,k) = Fibonacci(n+1-k)*C(n,k-1), k = 1..n; n &gt;= 1.
 * @author Georg Fischer
 */
public class A094440 extends BaseTriangle {

  /** Construct the sequence. */
  public A094440() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Fibonacci.fibonacci(n + 1 - k).multiply(Binomial.binomial(n, k - 1));
  }
}
