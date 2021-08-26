package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050875 Binary numbers d(1)...d(j) such that d(i) != d(j+1-i) for all but 6 values of i.
 * @author Sean A. Irvine
 */
public class A050875 implements Sequence {

  private long mN = 1;

  private int count(final String s) {
    int cnt = 0;
    for (int k = 0, j = s.length() - 1; k <= j; ++k, --j) {
      if (s.charAt(k) == s.charAt(j)) {
        cnt += k == j ? 1 : 2;
      }
    }
    return cnt;
  }

  protected int target() {
    return 6;
  }

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, base());
      if (count(s) == target()) {
        return Z.valueOf(mN);
      }
    }
  }
}
