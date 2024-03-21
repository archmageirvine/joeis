package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068855 a(1) = 1; a(n) is the smallest triangular number &gt; a(n-1) which differs from it at every digit.
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
