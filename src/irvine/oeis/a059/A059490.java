package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059490 Expansion of generating function A_{QT}^(1)(4n;2).
 * @author Sean A. Irvine
 */
public class A059490 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE.shiftLeft((long) mN * mN - mN);
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        prod = prod.multiply(4L * j - 4L * i + 1);
      }
    }
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        prod = prod.divide(j - i + mN);
      }
    }
    return prod.abs();
  }
}
