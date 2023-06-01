package irvine.oeis.a137;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137773 Triangular sequence: The Fibonacci sequence on the diagonal, 1's at all other places.
 * @author Georg Fischer
 */
public class A137773 extends BaseTriangle {

  /** Construct the sequence. */
  public A137773() {
    super(1, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == k) ? Fibonacci.fibonacci(n) : Z.ONE;
  }
}
