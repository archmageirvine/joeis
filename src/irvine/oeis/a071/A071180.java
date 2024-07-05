package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071180 Number of numbers m with n &lt; m &lt;= n^2 containing n in decimal representation.
 * @author Sean A. Irvine
 */
public class A071180 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long cnt = 0;
    for (long k = mN + 1; k <= mN * mN; ++k) {
      if (String.valueOf(k).contains(s)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
