package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.Triple;

/**
 * A390736 allocated for Hamidreza Maleki Tirabadi.
 * @author Sean A. Irvine
 */
public class A390736 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Map<Triple<Integer>, Z> states = Collections.singletonMap(new Triple<>(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), Z.ONE);
    for (int k = 0; k < n; ++k) {
      final Map<Triple<Integer>, Z> nextStates = new HashMap<>();
      for (final Map.Entry<Triple<Integer>, Z> e : states.entrySet()) {
        final Triple<Integer> prev = e.getKey();
        final int p1 = prev.left();
        final int p2 = prev.mid();
        final int p3 = prev.right();
        final Z count = e.getValue();
        for (int king1 = 0; king1 < n - 4; ++king1) {
          if (Math.abs(p1 - king1) > 1 && Math.abs(p2 - king1) > 1 && Math.abs(p3 - king1) > 1) {
            for (int king2 = king1 + 2; king2 < n - 2; ++king2) {
              if (Math.abs(p3 - king2) > 1 && Math.abs(p2 - king2) > 1 && Math.abs(p1 - king2) > 1) {
                for (int king3 = king2 + 2; king3 < n; ++king3) {
                  if (Math.abs(p3 - king3) > 1 && Math.abs(p2 - king3) > 1 && Math.abs(p1 - king3) > 1) {
                    nextStates.merge(new Triple<>(king1, king2, king3), count, Z::add);
                  }
                }
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
