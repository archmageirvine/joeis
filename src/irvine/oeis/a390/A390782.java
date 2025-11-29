package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.Quadruple;

/**
 * A390782 Number of n X n grids with 4 non-attacking kings on each row.
 * @author Sean A. Irvine
 */
public class A390782 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Map<Quadruple<Integer>, Z> states = Collections.singletonMap(new Quadruple<>(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), Z.ONE);
    for (int k = 0; k < n; ++k) {
      final Map<Quadruple<Integer>, Z> nextStates = new HashMap<>();
      for (final Map.Entry<Quadruple<Integer>, Z> e : states.entrySet()) {
        final Quadruple<Integer> prev = e.getKey();
        final int p1 = prev.a();
        final int p2 = prev.b();
        final int p3 = prev.c();
        final int p4 = prev.d();
        final Z count = e.getValue();
        for (int king1 = 0; king1 < n - 6; ++king1) {
          if (Math.abs(p1 - king1) > 1 && Math.abs(p2 - king1) > 1 && Math.abs(p3 - king1) > 1 && Math.abs(p4 - king1) > 1) {
            for (int king2 = king1 + 2; king2 < n - 4; ++king2) {
              if (Math.abs(p4 - king2) > 1 && Math.abs(p3 - king2) > 1 && Math.abs(p2 - king2) > 1 && Math.abs(p1 - king2) > 1) {
                for (int king3 = king2 + 2; king3 < n - 2; ++king3) {
                  if (Math.abs(p4 - king3) > 1 && Math.abs(p3 - king3) > 1 && Math.abs(p2 - king3) > 1 && Math.abs(p1 - king3) > 1) {
                    for (int king4 = king3 + 2; king4 < n; ++king4) {
                      if (Math.abs(p4 - king4) > 1 && Math.abs(p3 - king4) > 1 && Math.abs(p2 - king4) > 1 && Math.abs(p1 - king4) > 1) {
                        nextStates.merge(new Quadruple<>(king1, king2, king3, king4), count, Z::add);
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
