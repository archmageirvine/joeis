package irvine.oeis.a390;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390217 allocated for Thomas Hutton.
 * @author Sean A. Irvine
 */
public class A390217 extends Sequence0 {

  private static final int COLOURS = 4;
  private int mN = -1;
  private final HashMap<String, Long> mCounts = new HashMap<>();

  protected boolean accept(final int sum) {
    return (sum & 3) == 0;
  }

  private long count(final int[] p, final int pos, final int prevColor, final int sum) {
    if (pos == p.length) {
      return accept(sum) ? 1 : 0;
    }
    final int startColour = pos == 0 || p[pos - 1] != p[pos] ? 0 : prevColor;
    long total = 0;
    for (int c = startColour; c < COLOURS; ++c) {
      total += count(p, pos + 1, c, sum + c);
    }
    return total;
  }

  private long count(final int[] canon) {
    final String key = Arrays.toString(canon);
    final Long cnt = mCounts.get(key);
    if (cnt != null) {
      return cnt;
    }
    final long c = count(canon, 0, -1, 0);
    mCounts.put(key, c);
    return c;
  }

  private int[] canonical(final int[] c, final int parts) {
    Arrays.sort(c);
    final int[] canon = new int[parts];
    int k = 0;
    int i = 0;
    for (final int cnt : c) {
      if (cnt != 0) {
        for (int j = 0; j < cnt; ++j) {
          canon[k++] = i;
        }
        ++i;
      }
    }
    return canon;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    int[] c = new int[mN + 1];
    long cnt = 0;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      cnt += count(canonical(c, p.length));
    }
    return Z.valueOf(cnt);
  }
}
