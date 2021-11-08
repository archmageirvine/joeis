package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144257 Weight array of A086270.
 *
 * @author Georg Fischer
 */
public class A144257 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144257() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 ? k : k - 1);
  }
}
