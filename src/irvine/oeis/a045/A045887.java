package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045887 Number of distinct even numbers visible as proper subsequences of n.
 * @author Sean A. Irvine
 */
public class A045887 extends Sequence0 {

  private long mN = -1;
  private final TreeSet<Long> mA = new TreeSet<>();

  private void search(final String s, final int k, final long v, final boolean nonempty) {
    if (k == s.length()) {
      if (v != mN && (v & 1) == 0 && nonempty) {
        mA.add(v);
      }
      return;
    }
    search(s, k + 1, v, nonempty);
    search(s, k + 1, v * 10 + s.charAt(k) - '0', true);
  }

  @Override
  public Z next() {
    mA.clear();
    search(String.valueOf(++mN), 0, 0, false);
    return Z.valueOf(mA.size());
  }
}
