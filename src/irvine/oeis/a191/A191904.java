package irvine.oeis.a191;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A191904 Square array read by antidiagonals up: T(n,k) = 1-k if k divides n, else 1.
 * @author Georg Fischer
 */
public class A191904 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A191904() {
    super(1, 1, +1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((n % k == 0) ? 1 - k : 1);
  }
}
