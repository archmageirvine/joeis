package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059477 3-enumeration of n X n alternating-sign matrices.
 * @author Sean A. Irvine
 */
public class A059477 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.THREE.pow((long) mN * mN - mN);
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1 + (i & 1); j <= mN; j += 2) {
        prod = prod.multiply(3L * j - 3L * i + 1);
      }
    }
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1 + (i & 1); j <= mN; j += 2) {
        prod = prod.divide(3L * j - 3L * i);
      }
    }
    return prod.shiftLeft(mN - (long) mN * mN);
  }
}
