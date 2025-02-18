package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A075302 Transpose of array A075300.
 * @author Sean A. Irvine
 */
public class A075302 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A075302() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int k, final int n) {
    return Z.ONE.shiftLeft(n).multiply(2L * k + 1).subtract(1);
  }
}
