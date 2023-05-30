package irvine.oeis.a300;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A300401 Array T(n,k) = n*(binomial(k, 2) + 1) + k*(binomial(n, 2) + 1) read by antidiagonals.
 * @author Georg Fischer
 */
public class A300401 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A300401() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(k, 2).add(1).multiply(n).add(Binomial.binomial(n, 2).add(1).multiply(k));
  }
}
