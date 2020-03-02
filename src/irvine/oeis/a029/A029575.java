package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029575 Number of permutations of an n-set containing an <code>8-cycle</code>.
 * @author Sean A. Irvine
 */
public class A029575 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    Z f = mF;
    for (long k = 0; k <= mN / 8; ++k) {
      if (k > 0) {
        f = f.divide(8 * k);
      }
      sum = sum.signedAdd((k & 1) == 0, f);
    }
    return mF.subtract(sum);
  }
}
