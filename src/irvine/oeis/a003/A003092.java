package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003092.
 * @author Sean A. Irvine
 */
public class A003092 implements Sequence {

  private Z mP = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      mP = Z.valueOf(mN - 1);
    } else {
      mP = mP.multiply(5)
        .multiply(5 * mN - 11)
        .multiply(5 * mN - 12)
        .multiply(5 * mN - 13)
        .multiply(5 * mN - 14)
        .multiply(mN - 1)
        .multiply(mN)
        .divide(2 * mN - 3)
        .divide(4 * mN - 7)
        .divide(4 * mN - 9)
        .divide(mN - 2)
        .divide(mN - 2)
        .divide(8);
    }
    return mP;
  }
}
