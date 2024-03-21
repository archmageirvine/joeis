package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068854 a(1) = 1; a(n) is the smallest square &gt; a(n-1) which differs from it at every digit.
 * @author Sean A. Irvine
 */
public class A068854 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = mN * mN;
    while (true) {
      ++mN;
      if (A068853.is(s, mN * mN)) {
        return Z.valueOf(mN * mN);
      }
    }
  }
}
