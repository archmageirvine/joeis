package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A087396 Smallest nontrivial multiple of n with each digit occurring with the same frequency &gt;1. By nontrivial we mean a(n) is not a concatenation of n with itself.
 * @author Sean A. Irvine
 */
public class A087396 extends Sequence1 {

  private long mN = 0;

  private boolean is(final int[] cnts) {
    int c = 0;
    for (final int v : cnts) {
      if (v == 1) {
        return false;
      }
      if (v != 0) {
        if (c == 0) {
          c = v;
        } else if (c != v) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final String s = String.valueOf(mN);
    final StringBuilder fs = new StringBuilder(s);
    Z m = Z.valueOf(mN);
    Z forbid = m;
    while (true) {
      m = m.add(mN);
      if (m.compareTo(forbid) > 0) {
        fs.append(s);
        forbid = new Z(fs);
      }
      if (!m.equals(forbid)) {
        final int[] cnts = ZUtils.digitCounts(m);
        if (is(cnts)) {
          return m;
        }
      }
    }
  }
}
