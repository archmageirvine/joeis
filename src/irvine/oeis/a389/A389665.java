package irvine.oeis.a389;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A389665 allocated for Hamidreza Maleki Tirabadi.
 * @author Sean A. Irvine
 */
public class A389665 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Map<Pair<Integer, Integer>, Z> states = Collections.singletonMap(new Pair<>(Integer.MAX_VALUE, Integer.MAX_VALUE), Z.ONE);
    for (int k = 0; k < n; ++k) {
      final Map<Pair<Integer, Integer>, Z> nextStates = new HashMap<>();
      for (final Map.Entry<Pair<Integer, Integer>, Z> e : states.entrySet()) {
        final Pair<Integer, Integer> prev = e.getKey();
        final int p1 = prev.left();
        final int p2 = prev.right();
        final Z count = e.getValue();
        for (int king1 = 0; king1 < n - 2; ++king1) {
          if (Math.abs(p1 - king1) > 1 && Math.abs(p2 - king1) > 1) {
            for (int king2 = king1 + 2; king2 < n; ++king2) {
              if (Math.abs(p2 - king2) > 1 && Math.abs(p1 - king2) > 1) {
                nextStates.merge(new Pair<>(king1, king2), count, Z::add);
              }
            }
          }
        }
      }
      states = nextStates;
    }
    return Functions.SUM.z(states.values());
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
