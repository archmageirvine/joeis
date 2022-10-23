package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045888 Number of distinct odd numbers visible as proper subsequences of n.
 * @author Sean A. Irvine
 */
public class A045888 extends Sequence1 {

  private long mN = 0;
  private final TreeSet<Long> mA = new TreeSet<>();

  private void search(final String s, final int k, final long v) {
    if (k == s.length()) {
      if (v != mN && (v & 1) == 1) {
        mA.add(v);
      }
      return;
    }
    search(s, k + 1, v);
    search(s, k + 1, v * 10 + s.charAt(k) - '0');
  }

  @Override
  public Z next() {
    mA.clear();
    search(String.valueOf(++mN), 0, 0);
    return Z.valueOf(mA.size());
  }
}
