package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037224 Number of permutations p of {1,2,3...,n} that are fixed points under the operation of first reversing p, then taking the inverse.
 * @author Sean A. Irvine
 */
public class A037224 implements Sequence {

  private int mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    switch (++mN & 3) {
      case 0:
        final int m = mN / 4;
        if (m > 1) {
          mF = mF.multiply(2 * m - 1).multiply(2 * m - 2).divide(m - 1);
        }
        // FALL THROUGH
      case 1:
        if (mN == 1) {
          return Z.ONE;
        }
        return mF;
      case 2:
      case 3:
      default:
        return Z.ZERO;
    }
  }
}
