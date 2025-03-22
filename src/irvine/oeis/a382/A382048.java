package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A382048 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long d = 1;
    long m = mN;
    while (m != 0) {
      ++cnt;
      m -= d;
      if (m % (d + 1) == 0) {
        ++d;
      }
    }
    return Z.valueOf(cnt);
  }
}
