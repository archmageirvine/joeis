package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A062172 Table T(n,k) by antidiagonals of n^(k-1) mod k [n,k &gt; 0].
 * @author Georg Fischer
 */
public class A062172 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A062172() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n).pow(k - 1).mod(Z.valueOf(k));
  }
}
