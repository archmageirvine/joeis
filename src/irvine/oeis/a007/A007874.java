package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007874 Distinct perimeter lengths of polygons with regularly spaced vertices.
 * @author Sean A. Irvine
 */
public class A007874 implements Sequence {

  private static final int PRECISION = 100;
  private final HashSet<List<Integer>> mA = new HashSet<>();
  private int mN = 0;

  private void search(final int[] counts, final boolean[] used, final int pos, final int step) {
    if (step == mN) {
      // We are done, add last step back to 0
      final int delta = pos < counts.length ? pos : mN - pos;
      ++counts[delta];
      // Keep this result
      final ArrayList<Integer> res = new ArrayList<>(counts.length);
      for (final int v : counts) {
        res.add(v);
      }
      mA.add(res);
      --counts[delta];
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

  @Override
  public Z next() {
    ++mN;
    mA.clear();
    final boolean[] used = new boolean[mN];
    used[0] = true;
    search(new int[mN / 2 + 1], used, 0, 1);

    // Some different polygons in mA are actually the same length
    // I would like a smarter method of determining when they are the same.
    final CR[] a = new CR[mN / 2 + 1];
    for (int k = 0; k <= mN / 2; ++k) {
      a[k] = CR.TWO.subtract(CR.TWO.multiply(ComputableReals.SINGLETON.cos(CR.PI.multiply(new Q(2L * k, mN))))).sqrt();
    }
    final HashSet<String> unique = new HashSet<>(mA.size());
    for (final List<Integer> v : mA) {
      CR sum = CR.ZERO;
      for (int k = 1; k < v.size(); ++k) {
        sum = sum.add(a[k].multiply(v.get(k)));
      }
      unique.add(sum.toString(PRECISION).substring(0, 50));
    }
    return Z.valueOf(unique.size());
  }

}
