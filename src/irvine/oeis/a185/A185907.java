package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185907 Weight array of A185908, by descending antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185907 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185907() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k == 1 || n == k ? 1 : 0);
  }
}
