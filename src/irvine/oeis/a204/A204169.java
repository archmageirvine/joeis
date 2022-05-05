package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.a203.A203991;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204169 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of (i+j-1), as in A002024.
 * @author Georg Fischer
 */
public class A204169 extends A203991 {

  /** Construct the sequence. */
  public A204169() {
    super(1, new UpperLeftTriangle(1, 1, -1) {
      @Override
      public Z matrixElement(final int i, final int j) {
        return Z.valueOf(i + j - 1);
      }
    });
  }
}
