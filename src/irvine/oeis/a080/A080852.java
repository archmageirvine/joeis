package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A080852 Square array of 4D pyramidal numbers, read by antidiagonals.
 * <code>T(n, k) = binomial(k + 4, 4) + (n-1)*binomial(k + 3, 4)</code>
 * @author Georg Fischer
 */
public class A080852 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A080852() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(k + 4, 4).add(Binomial.binomial(k + 3, 4).multiply(n - 1));
  }
}
