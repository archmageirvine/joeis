package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A053398 Nim-values from game of Kopper's Nim.
 * @author Georg Fischer
 */
public class A053398 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A053398() {
    super(0, 0, -1);
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return /* n + k == 0 ? Z.ZERO : */ Z.valueOf(Long.numberOfTrailingZeros((n | k) + 1));
  }
}
