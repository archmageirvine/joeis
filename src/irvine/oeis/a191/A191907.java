package irvine.oeis.a191;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A191907 Square array read by antidiagonals up: T(n,k) = -(n-1) if n divides k, else 1.
 * @author Georg Fischer
 */
public class A191907 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A191907() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((k % n == 0) ? 1 - n : 1);
  }
}
