package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A080851 Square array of pyramidal numbers, read by antidiagonals.
 * <code>T(n, k) = binomial(k+3, 3) + (n-1)*binomial(k+2, 3)</code>
 * @author Georg Fischer
 */
public class A080851 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A080851() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(k + 3, 3).add(Binomial.binomial(k + 2, 3).multiply(n - 1));
  }
}
