package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A116588 Array read by antidiagonals: T(n,k) = max(2^(n - k), 2^(k - n)).
 * @author Georg Fischer
 */
public class A116588 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A116588() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.ONE.shiftLeft(n > k ? n - k : k - n);
  }
}
