package irvine.oeis.a015;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A015135.
 * @author Sean A. Irvine
 */
public class A015135 implements Sequence {

  private int mN = 0;

  static long period(int x, int y, final int m) {
    final HashSet<Pair<Integer, Integer>> seen = new HashSet<>();
    seen.add(new Pair<>(x, y));
    int p = 0;
    while (true) {
      ++p;
      final int t = (x + y) % m;
      x = y;
      y = t;
      if (!seen.add(new Pair<>(x, y))) {
        return p;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> periods = new HashSet<>();
    for (int x = 0; x < mN; ++x) {
      for (int y = x; y < mN; ++y) { // seems sufficient to start y from x rather than 0
        periods.add(period(x, y, mN));
      }
    }
    return Z.valueOf(periods.size());
  }
}
