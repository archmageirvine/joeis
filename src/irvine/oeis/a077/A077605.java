package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A077605 Left summing matrix, S.
 * S(n, k)=1 if 1&lt;=k&lt;=n, else S(n, k)=0.
 * @author Georg Fischer
 */
public class A077605 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A077605() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return k <= n ? Z.ONE : Z.ZERO;
  }
}
