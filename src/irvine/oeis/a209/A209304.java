package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A209304 Table T(n,k)=n+4*k-4 n, k &gt; 0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A209304 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A209304() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + 4L * k - 4);
  }
}
