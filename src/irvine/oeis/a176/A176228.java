package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A176228 Triangle read by rows: T(n,k) = binomial(n,k) + Fibonacci(n) + 1.
 * @author Georg Fischer
 */
public class A176228 extends BaseTriangle {

  /** Construct the sequence. */
  public A176228() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k).add(Functions.FIBONACCI.z(n)).add(1);
  }
}
