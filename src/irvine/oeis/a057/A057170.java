package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057170 2-enumeration of 2n X 2n half-turn symmetric alternating-sign matrices.
 * @author Sean A. Irvine
 */
public class A057170 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft((long) ++mN * mN);
    for (int k = 1; k <= mN; ++k) {
      for (int j = 1 + (k & 1); j <= mN; j += 2) {
        t = t.multiply(2L * j - 2L * k + 1);
      }
    }
    for (int k = 1; k <= mN; ++k) {
      for (int j = 1 + (k & 1); j <= mN; j += 2) {
        t = t.divide(2L * j - 2L * k);
      }
    }
    return t;
  }
}
