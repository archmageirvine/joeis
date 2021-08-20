package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050874 Binary numbers d(1)...d(j) such that d(i)&lt;&gt;d(j+1-i) for all but 6 i.
 * @author Sean A. Irvine
 */
public class A050874 implements Sequence {

  private long mN = 1;

  private int count(final String s) {
    int cnt = 0;
    for (int k = 0, j = s.length() - 1; k < j; ++k, --j) {
      if (s.charAt(k) != s.charAt(j)) {
        ++cnt;
      }
    }
    return 2 * cnt;
  }

  protected int target() {
    return 6;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toBinaryString(++mN);
      if (count(s) == target()) {
        return Z.valueOf(mN);
      }
    }
  }
}
