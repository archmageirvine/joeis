package irvine.oeis.a080;
// manually fract21/trigf at 2023-05-27 19:57

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A080521 Triangle read by rows; n-th row contains the lexicographically first set of n distinct positive integers whose sum is 2^n.
 * @author Georg Fischer
 */
public class A080521 extends BaseTriangle {

  /** Construct the sequence. */
  public A080521() {
    super(1, 1, 1);
    hasRAM(true);
  }

  public Z triangleElement(final int n, final int k) {
    // T(n, n) = 2^n - n(n-1)/2.
    return (n != k) ? Z.valueOf(k) : Z.ONE.shiftLeft(n).subtract(n * (n - 1L) / 2);
  }
}
