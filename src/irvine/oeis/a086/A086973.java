
package irvine.oeis.a086;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086973 Period of oscillator reached starting with a segment of n consecutive live cells and applying the LongLife 2D rule (see comment).
 * @author Sean A. Irvine
 */
public class A086973 extends Sequence1 {

  // After R&eacute;my Sigrist

  private static final Lattice L = Lattices.Z2Q;
  private int mN = 0;

  static Set<Long> step(final Set<Long> state) {
    if (state.isEmpty()) {
      return state;
    }
    final Map<Long, Integer> counts = new HashMap<>();
    for (final long pt : state) {
      for (final long q : L.neighbours(pt)) {
        counts.merge(q, 1, Integer::sum);
      }
    }
    final Set<Long> res = new HashSet<>();
    for (final Map.Entry<Long, Integer> e : counts.entrySet()) {
      final long pt = e.getKey();
      final int cnt = e.getValue();
      if (state.contains(pt)) {
        if (cnt == 5) {
          res.add(pt);
        }
      } else if (cnt >= 3 && cnt <= 5) {
        res.add(pt);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    Set<Long> w = new HashSet<>();
    for (int k = 0; k < mN; ++k) {
      w.add(L.toPoint(k, 0));
    }
    Set<Long> ww = step(w);
    while (!w.equals(ww)) {
      w = step(w);
      ww = step(step(ww));
    }
    int period = 0;
    do {
      ww = step(ww);
      ++period;
    } while (!w.equals(ww));
    return Z.valueOf(period == 1 ? 0 : period);
  }
}
