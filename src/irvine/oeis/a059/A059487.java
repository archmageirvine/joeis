package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059487 Number of 2-enumeration of 4n X 4n quarter-turn symmetric alternating-sign matrices.
 * @author Sean A. Irvine
 */
public class A059487 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE.shiftLeft(2 * mN * mN - mN);
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
    return prod.multiply(((mN * (mN - 1) / 2) & 1) == 0 ? 1 : -1);
  }
}

