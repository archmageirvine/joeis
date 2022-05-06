package irvine.oeis.a204;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a203.A203991;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204135 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of the Delannoy matrix (A008288).
 * @author Georg Fischer
 */
public class A204135 extends A203991 {

  /** Construct the sequence. */
  public A204135() {
    super(1, new UpperLeftTriangle(1, 1, -1) {
      @Override
      public Z matrixElement(int n, int k) {
        --n;
        --k;
        Z sum = Z.ZERO;
        for (int d = Math.min(n, k); d >= 0; --d) {
          sum = sum.add(Binomial.binomial(k, d).multiply(Binomial.binomial(n + k - d, k)));
        }
        return sum;
      }
    });
  }
}
