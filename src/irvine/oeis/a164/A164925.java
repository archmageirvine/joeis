package irvine.oeis.a164;
// manually inverse at 2023-07-24 10:20

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A164925 Array, binomial(j-i,j), read by rising antidiagonals.
 * @author Georg Fischer
 */
public class A164925 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A164925() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return Binomial.binomial(j - i, j);
  }
}
