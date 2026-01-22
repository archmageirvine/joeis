package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068869.
 * @author Sean A. Irvine
 */
public class A392647 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= mN; ++x) {
      for (long y = 1; y <= mN; ++y) {
        for (long z = 1; z <= mN; ++z) {
          if (x * y - x * z + y * z == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
