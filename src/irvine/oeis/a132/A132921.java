package irvine.oeis.a132;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A132921 Triangle read by rows: T(n,k) = n + Fibonacci(k) - 1, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A132921 extends BaseTriangle {

  /** Construct the sequence. */
  public A132921() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Functions.FIBONACCI.z((long) k).add(n - 1);
  }
}
