package irvine.oeis.a079;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079029.
 * @author Sean A. Irvine
 */
public class A079030 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (LongUtils.classNumber(-4 * ++k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
