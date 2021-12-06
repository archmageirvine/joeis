package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A134574 Array, a(n,k) = total size of all n-length words on a k-letter alphabet, read by antidiagonals.
 * @author Georg Fischer
 */
public class A134574 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A134574() {
    super(1, 1, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k).pow(n).multiply(n);
  }
}
