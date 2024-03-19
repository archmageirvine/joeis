package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068855 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = mN * (mN + 1) / 2;
    while (true) {
      ++mN;
      final long t = mN * (mN + 1) / 2;
      if (A068853.is(s, t)) {
        return Z.valueOf(t);
      }
    }
  }
}
