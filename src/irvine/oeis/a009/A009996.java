package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009996 Numbers with digits in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A009996 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
    } else {
      int g = 0;
      while (mN > 10 && ((mN % 10) == 9 || (mN % 10) == ((mN / 10) % 10))) {
        ++g;
        mN /= 10;
      }
      ++mN;
      while (g-- > 0) {
        mN *= 10;
      }
    }
    return Z.valueOf(mN);
  }
}
