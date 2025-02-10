package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A075130 Primes with decimal representation 140{{0}10{9}89}.
 * @author Sean A. Irvine
 */
public class A075130 extends Sequence1 {

  private final TreeMap<Z, List<Pair<Integer, Integer>>> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, Collections.emptyList());
  }

  private Z compute(final List<Pair<Integer, Integer>> state) {
    final StringBuilder sb = new StringBuilder("140");
    for (final Pair<Integer, Integer> p : state) {
      sb.append("0".repeat(p.left())).append("10").append("9".repeat(p.right())).append("89");
    }
    return new Z(sb);
  }

  private void update(final List<Pair<Integer, Integer>> state) {
    mA.put(compute(state), state);
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, List<Pair<Integer, Integer>>> e = mA.pollFirstEntry();
      final Z n = e.getKey();
      final List<Pair<Integer, Integer>> state = e.getValue();
      // Add another outer repeat
      final ArrayList<Pair<Integer, Integer>> copy = new ArrayList<>(state);
      copy.add(new Pair<>(0, 0));
      update(copy);
      // Extending existing state in all possible ways
      for (int k = 0; k < state.size(); ++k) {
        final Pair<Integer, Integer> p = state.get(k);
        final ArrayList<Pair<Integer, Integer>> cpl = new ArrayList<>(state);
        cpl.set(k, new Pair<>(p.left() + 1, p.right()));
        update(cpl);
        final ArrayList<Pair<Integer, Integer>> cpr = new ArrayList<>(state);
        cpr.set(k, new Pair<>(p.left(), p.right() + 1));
        update(cpr);
      }
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}
