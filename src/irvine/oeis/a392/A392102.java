package irvine.oeis.a392;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392102 Squares which are the concatenation of two or more powers of 2.
 * @author Sean A. Irvine
 */
public class A392102 extends Sequence1 {

  private long mN = 8;
  private final MemoryFunction1<String> mPowersOfTwo = new MemoryFunction1<>() {
    @Override
    protected String compute(final int n) {
      return Z.ONE.shiftLeft(n).toString();
    }
  };

  private boolean is(final String m, final int cnt) {
    if (m.isEmpty()) {
      return cnt > 1;
    }
    if (m.charAt(0) == '0') {
      return false;
    }
    int k = -1;
    while (true) {
      final String t = mPowersOfTwo.get(++k);
      if (t.length() > m.length()) {
        return false;
      }
      if (m.startsWith(t) && is(m.substring(t.length()), cnt + 1)) {
        return true;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (is(s.toString(), 0)) {
        return s;
      }
    }
  }
}

