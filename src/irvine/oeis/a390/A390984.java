package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A390984 allocated for Hamidreza Maleki Tirabadi.
 * @author Sean A. Irvine
 */
public class A390984 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  private boolean allowed(final List<Integer> state, final int pos) {
    for (final int v : state) {
      if (Math.abs(v - pos) <= 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z a(final int n) {
    Map<List<Integer>, Z> states = Collections.singletonMap(List.of(Integer.MAX_VALUE), Z.ONE);
    for (int k = 0; k < n; ++k) {
      final Map<List<Integer>, Z> nextStates = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : states.entrySet()) {
        final List<Integer> prev = e.getKey();
        final Z count = e.getValue();
        for (int king1 = 0; king1 < n - 12; ++king1) {
          if (allowed(prev, king1)) {
            for (int king2 = king1 + 2; king2 < n - 10; ++king2) {
              if (allowed(prev, king2)) {
                for (int king3 = king2 + 2; king3 < n - 8; ++king3) {
                  if (allowed(prev, king3)) {
                    for (int king4 = king3 + 2; king4 < n - 6; ++king4) {
                      if (allowed(prev, king4)) {
                        for (int king5 = king4 + 2; king5 < n - 4; ++king5) {
                          if (allowed(prev, king5)) {
                            for (int king6 = king5 + 2; king6 < n - 2; ++king6) {
                              if (allowed(prev, king6)) {
                                for (int king7 = king6 + 2; king7 < n; ++king7) {
                                  if (allowed(prev, king7)) {
                                    nextStates.merge(List.of(king1, king2, king3, king4, king5, king6, king7), count, Z::add);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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
