package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A086460 Square array read by antidiagonals: T(n,k)=nk+0^n.
 * @author Georg Fischer
 */
public class A086460 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A086460() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return (k == 0) ? Z.ONE : Z.valueOf(k * n);
  }
}
