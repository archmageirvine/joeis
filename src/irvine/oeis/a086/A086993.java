
package irvine.oeis.a086;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086993 Number of generations needed to reach an oscillator, starting with a segment of n consecutive live cells and applying the LongLife 2D rule (see comment).
 * @author Sean A. Irvine
 */
public class A086993 extends Sequence1 {

  private static final Lattice L = Lattices.Z2Q;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Set<Long> w = new HashSet<>();
    for (int k = 0; k < mN; ++k) {
      w.add(L.toPoint(k, 0));
    }

    // todo this counting is apparently not currently correct
    int k = 0;
    final HashMap<Set<Long>, Integer> seen = new HashMap<>();
    while (true) {
      final Integer v = seen.put(w, ++k);
      if (v != null) {
        return Z.valueOf(seen.size() - (k - v));
      }
      w = A086973.step(w);
    }
  }
}
