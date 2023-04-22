package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063250 Number of binary right-rotations (iterations of A038572) to reach fixed point.
 * @author Sean A. Irvine
 */
public class A063250 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (true) {
      final long t = LongUtils.rotateRight(m);
      if (t == m) {
        return Z.valueOf(cnt);
      }
      ++cnt;
      m = t;
    }
  }
}
