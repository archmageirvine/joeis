package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059486 3-enumeration of 2n+1 X 2n+1 vertically symmetric alternating-sign matrices.
 * @author Sean A. Irvine
 */
public class A059486 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.THREE.pow(2L * mN * mN);
    for (int i = 1; i <= 2 * mN + 1; i += 2) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.multiply(3L * j - 3L * i + 1);
      }
    }
    for (int i = 1; i <= 2 * mN + 1; i += 2) {
      for (int j = 2; j <= 2 * mN + 1; j += 2) {
        prod = prod.divide(3L * j - 3L * i);
      }
    }
    return prod.shiftRight(2 * mN * mN + mN);
  }
}
