package irvine.oeis.a143;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143211 Triangle read by rows, T(n,k) = Fibonacci(n)*Fibonacci(k).
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
    return Functions.FIBONACCI.z(n).multiply(Functions.FIBONACCI.z(k));
  }
}
