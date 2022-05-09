package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.a203.A203991;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204170 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of (i*j), as in A003991.
 * @author Georg Fischer
 */
public class A204170 extends A203991 {

  /** Construct the sequence. */
  public A204170() {
    super(1, new UpperLeftTriangle(1, 1, -1) {
      @Override
      public Z matrixElement(final int i, final int j) {
        return Z.valueOf((long) i * j);
      }
    });
  }
}
