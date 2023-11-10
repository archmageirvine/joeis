package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A066709 Triangle T(r,c) of winning binary "same game" templates.
 * @author Sean A. Irvine
 */
public class A066709 extends Sequence1 {

  // (n, m) - > n * (n + 1) / 2 + m (linearized triangle)
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;
  private long mT = 0;

  private long getIndex(final long n, final long m) {
    return n * (n + 1) / 2 + m;
  }

  private void search(final long remaining, final StringBuilder sb, final char c, final int a) {
    if (remaining == 0) {
      if (A066346.isWinning(sb.toString())) {
        final long index = getIndex(sb.length(), a);
        mCounts.set(index, mCounts.get(index) + 1);
      }
      return;
    }
    final int pos = sb.length();
    sb.append(c);
    search(remaining - 1, sb, c == '1' ? '0' : '1', a);
    if (remaining > 1) {
      sb.append(c);
      search(remaining - 2, sb, c == '1' ? '0' : '1', a + 1);
    }
    sb.setLength(pos);
  }

  private long t(final long n, final long m) {
    while (n + m > mT) {
      search(++mT, new StringBuilder(), '1', 0);
    }
    return mCounts.get(getIndex(n + m, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
  }
}
