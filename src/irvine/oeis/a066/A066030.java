package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065964.
 * @author Sean A. Irvine
 */
public class A066030 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if ((mN / k) % k == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
