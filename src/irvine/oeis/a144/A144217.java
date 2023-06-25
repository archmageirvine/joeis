package irvine.oeis.a144;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144217 Weight array of A144216: a rectangular array by antidiagonals.
 * @author Georg Fischer
 */
public class A144217 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144217() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((k == 1) ? n - 1 : ((n == 1) ? k - 1 : 0));
  }
}
