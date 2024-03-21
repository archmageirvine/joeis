package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068860 a(1) = 1; a(n+1) is the smallest number &gt; a(n) which differs from it at every digit.
 * @author Sean A. Irvine
 */
public class A068860 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = mN;
    while (true) {
      ++mN;
      if (A068853.is(s, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
