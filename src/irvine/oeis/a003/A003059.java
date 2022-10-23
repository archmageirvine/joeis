package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003059 k appears 2k-1 times. Also, square root of n, rounded up.
 * @author Sean A. Irvine
 */
public class A003059 extends Sequence1 {

  private long mN = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC >= 2 * mN - 1) {
      ++mN;
      mC = 0;
    }
    return Z.valueOf(mN);
  }
}
