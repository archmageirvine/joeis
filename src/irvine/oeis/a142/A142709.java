package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401432.
 * @author Sean A. Irvine
 */
public class A142709 extends Sequence0 {

  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      if (++mM == 1) {
        ++mN;
        return Z.TWO;
      }
      return Z.ONE;
    }
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 1) {
      return mN == 1 ? Z.SEVEN : Z.valueOf(4 * mN + 2);
    }
    return mN == mM ? Z.ONE : Z.ZERO;
  }
}
