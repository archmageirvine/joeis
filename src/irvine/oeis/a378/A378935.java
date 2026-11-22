package irvine.oeis.a378;

import irvine.math.z.Z;
import irvine.oeis.a360.A360873;

/**
 * A378935 Array read by antidiagonals: T(m,n) is the number of minimal edge cuts in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A378935 extends A360873 {
  @Override
  protected Z term(final int m, final int n) {
    final Z a = Z.ONE.shiftLeft(m - 1).subtract(1);
    final Z b = Z.ONE.shiftLeft(n - 1).subtract(1);
    return super.term(m, n).add(a.multiply(b)).subtract(Z.ONE.shiftLeft((long) m * n - 1));
  }
}
