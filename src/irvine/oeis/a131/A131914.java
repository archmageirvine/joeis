package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A131914 3*A002024 - 2*A051340.
 * @author Georg Fischer
 */
public class A131914 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A131914() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // T(n,k) = n + 3*k - 3
    return Z.valueOf(n + 3 * k - 3);
  }
}
