package irvine.oeis.a352;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A352568 allocated for N. J. A. Sloane.
 * @author Sean A. Irvine
 */
public class A352568 implements Sequence {

  protected final HashSet<List<Integer>> mA = new HashSet<>();
  protected int mN = 0;

  private void search(final int[] counts, final boolean[] used, final int pos, final int step) {
    if (step == mN) {
      // Keep this result
      final ArrayList<Integer> res = new ArrayList<>(counts.length);
      for (final int v : counts) {
        res.add(v);
      }
      mA.add(res);
      return;
    }
    final int limit = step == 1 ? mN / 2 : mN - 1;
    for (int k = 1; k <= limit; ++k) {
      if (!used[k]) {
        final int d = Math.abs(k - pos);
        final int delta = d < counts.length ? d : mN - d;
        ++counts[delta];
        used[k] = true;
        search(counts, used, k, step + 1);
        used[k] = false;
        --counts[delta];
      }
    }
  }

  protected void step() {
    ++mN;
    mA.clear();
    final boolean[] used = new boolean[mN];
    used[0] = true;
    search(new int[mN / 2 + 1], used, 0, 1);
  }

  @Override
  public Z next() {
    step();
    return Z.valueOf(mA.size());
  }
}
