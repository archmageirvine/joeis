package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144112 Weight array W={w(i,j)} of the natural number array A000027.
 *
 * @author Georg Fischer
 */
public class A144112 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144112() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k == 1 ? n : (n == 1 ? k - 1 : 1));
  }
}
