package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144113 Weight array W={w(i,j)} of the natural number array A038722.
 *
 * @author Georg Fischer
 */
public class A144113 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144113() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 ? k : (k == 1 ? n - 1 : 1));
  }
}
