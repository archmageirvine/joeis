package irvine.oeis.a051;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A051787 Expected number of spins in a 2-player Dreidel game (rounded to nearest integer).
 * @author Sean A. Irvine
 */
public class A051787 implements Sequence {

  private int mNuts = 0;

  private Triple<Integer> createState(final int a, final int b, final int p) {
    return p != 0 ? new Triple<>(a, b, p) : new Triple<>(a - 1, b - 1, 2);
  }

  private boolean isTerminal(final Triple<Integer> state) {
    return state.left() <= 0 || state.mid() <= 0;
  }

  private void update(final Map<Triple<Integer>, Q> map, final Triple<Integer> state, final Q p) {
    final Q t = map.get(state);
    if (t == null) {
      map.put(state, p);
    } else {
      map.put(state, t.add(p));
    }
  }

  @Override
  public Z next() {
    ++mNuts;
    Q expected = Q.ZERO;
    Map<Triple<Integer>, Q> state = Collections.singletonMap(createState(mNuts, mNuts, 0), Q.ONE);
    for (int round = 1; round < 10; ++round) {
      final Map<Triple<Integer>, Q> next = new HashMap<>();
      for (final Map.Entry<Triple<Integer>, Q> e : state.entrySet()) {
        final Triple<Integer> s = e.getKey();
        final Q p = e.getValue();
        if (isTerminal(s)) {
          expected = expected.add(p.multiply(round - 1));
        } else {
          final Q q = p.divide(4);
          update(next, s, q);
          final int half = (s.right() + 1) /2;
          if ((round & 1) == 1) {
            update(next, createState(s.left() + half, s.mid(), s.right() - half), q);
            update(next, createState(s.left() + s.right(), s.mid(), 0), q);
            update(next, createState(s.left() - 1, s.mid(), s.right() + 1), q);
          } else {
            update(next, createState(s.left(), s.mid() + half, s.right() - half), q);
            update(next, createState(s.left(), s.mid() + s.right(), 0), q);
            update(next, createState(s.left(), s.mid() - 1, s.right() + 1), q);
          }
        }
      }
      state = next;
      System.out.println(state);
    }
    return expected.round();
  }
}
