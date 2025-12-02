package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
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

  // This could be made to support larger n by replacing Long with BitSet

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  private boolean allowed(final Long state, final int pos) {
    final long mask = (0b111L << pos) >> 1;
    return (state & mask) == 0;
  }

  @Override
  public Z a(final int n) {
    Map<Long, Z> states = Collections.singletonMap(0L, Z.ONE);
    for (int k = 0; k < n; ++k) {
      final Map<Long, Z> nextStates = new HashMap<>();
      for (final Map.Entry<Long, Z> e : states.entrySet()) {
        final Long prev = e.getKey();
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
                                    final long next = (1L << king1)
                                      | (1L << king2)
                                      | (1L << king3)
                                      | (1L << king4)
                                      | (1L << king5)
                                      | (1L << king6)
                                      | (1L << king7);
                                    nextStates.merge(next, count, Z::add);
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
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    return a(mN);
  }
}
