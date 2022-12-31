package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A081130 Square array of binomial transforms of (0,0,1,0,0,0,...), read by antidiagonals.
 * @author Georg Fischer
 */
public class A081130 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A081130() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // T(n, k) = k^(n-2)*binomial(n, 2), with T(n, 0) = 0
    return (n < 2 || k == 0) ? Z.ZERO : Binomial.binomial(n, 2).multiply(Z.valueOf(k).pow(n - 2));
  }
}
