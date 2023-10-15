package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A238339 Square number array T(n,k) = (2*n^(k+1)-n-1)/(n-1), read by antidiagonals.
 * @author Georg Fischer
 */
public class A238339 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A238339() {
    super(0, 0, +1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return (n == 1) ? Z.valueOf(2 * k + 1) : Z.valueOf(n).pow(k + 1).multiply2().subtract(n + 1).divide(n - 1);
  }
}
