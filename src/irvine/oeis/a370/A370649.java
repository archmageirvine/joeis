package irvine.oeis.a370;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A370649 Dimension of space of equivariant linear maps from R^{n^3} to R^{n^3} under diagonal action of {-1, 1}^n.
 * @author Sean A. Irvine
 */
public class A370649 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 1L << mN; ++k) {
      long s = 0;
      long v = k;
      for (int j = 0; j < mN; ++j, v >>= 1) {
        s += 2 * (v & 1) - 1; // 1 -> 1, 0 -> -1
      }
      sum = sum.add(Z.valueOf(s).pow(6));
    }
    return sum.shiftRight(mN);
  }
}

