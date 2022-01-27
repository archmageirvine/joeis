package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A077606 Left differencing matrix, D, by antidiagonals.
 * D(n, n-1)=-1, D(n, n)=1, else D(n, k)=0.
 * @author Georg Fischer
 */
public class A077606 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A077606() {
    super(1, 1, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return k == n ? Z.ONE : (k == n - 1 ? Z.NEG_ONE : Z.ZERO);
  }
}
