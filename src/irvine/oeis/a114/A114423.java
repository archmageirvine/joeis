package irvine.oeis.a114;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A114423 Multifactorial array read by ascending antidiagonals.
 * @author Georg Fischer
 */
public class A114423 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A114423() {
    super(0, 1, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Functions.MULTIFACTORIAL.z(k, n);
  }
}
