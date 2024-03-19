package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068853 a(1) = 2; a(n+1) is the smallest prime &gt; a(n) which differs from it in every digit.
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
