package irvine.oeis.a048;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.ToLongFunction;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Pair;

/**
 * A048182 Variation on A047988, where division by d costs d points instead of 0 points.
 * @author Sean A. Irvine
 */
public class A048182 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> expanded = new TreeSet<>(); // values already encountered
    final TreeSet<Pair<Long, Long>> set = new TreeSet<>(Comparator.comparingLong((ToLongFunction<Pair<Long, Long>>) Pair::right).thenComparingLong(Pair::left));
    set.add(new Pair<>(mN, 0L));
    while (true) {
      final Pair<Long, Long> e = set.pollFirst();
      final long v = e.left();
      final long cost = e.right();
      if (v == 2) {
        return Z.valueOf(cost);
      }
      if (expanded.add(v)) {
        set.add(new Pair<>(v + 1, cost + 1));
        if (v > 2) {
          set.add(new Pair<>(v - 1, cost + 1));
        }
        for (long s = LongUtils.sqrt(v); s >= 2; --s) {
          if (v % s == 0) {
            set.add(new Pair<>(v / s, cost + s));
          }
        }
      }
    }
  }
}
