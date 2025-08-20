package irvine.oeis.a079;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079486 Number of different solutions to a variant of the 3-ball tennis ball problem.
 * @author Sean A. Irvine
 */
public class A079486 extends Sequence1 {

  // We maintain states as an integer array, mS
  // mS[0] contains the low ball of the column
  // mS[1] contains the high ball of the column
  // The remainder of mS is the balls still available for use.
  // There is a mapping from these states to the number of ways of achieving that state.
  //
  // To compute the next column (i.e. next a(n)), we iterate over the existing states
  // computing all possible next states based on the current mS and the three new balls.

  private static final class State {
    private final int[] mS;

    private State(final int[] s) {
      mS = s;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      return Arrays.equals(mS, ((State) obj).mS);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mS);
    }

    @Override
    public String toString() {
      return Arrays.toString(mS);
    }
  }

  private int mN = -2;
  private HashMap<State, Z> mCounts = new HashMap<>();
  {
    mCounts.put(new State(new int[] {0, 0}), Z.ONE);
  }

  private int v(final int[] s, final int k) {
    return k < s.length ? s[k] : mN + k - s.length;
  }

  @Override
  public Z next() {
    mN += 3; // mN is the lowest of next triple of balls
    final HashMap<State, Z> newCounts = new HashMap<>();
    for (final Map.Entry<State, Z> e : mCounts.entrySet()) {
      final int[] s = e.getKey().mS;
      final Z cnt = e.getValue();
      final int lo = s[0];
      final int hi = s[1];
      // New allowed values are mN, mN + 1, mN + 2
      for (int k = 2; k < s.length + 2; ++k) {
        // lo cannot be the mN + 3
        final int newlo = v(s, k);
        if (newlo > lo) {
          for (int j = k + 1; j < s.length + 3; ++j) {
            // hi > lo
            final int newhi = v(s, j);
            if (newhi > hi) {
              // (newlo, newhi) are our new column
              // new length is oldlength + 3 new values - 1 new hi - everything less than newlo
              final int len = s.length + 3 - k;
              final int[] newS = new int[len];
              newS[0] = newlo;
              newS[1] = newhi;
              for (int i = k + 1, l = 2; i < s.length + 3; ++i) {
                final int v = v(s, i);
                if (v != newhi) {
                  newS[l++] = v;
                }
              }
              newCounts.merge(new State(newS), cnt, Z::add);
            }
          }
        }
      }
      mCounts = newCounts;
    }
    //System.out.println(mCounts);
    Z sum = Z.ZERO;
    for (final Z v : mCounts.values()) {
      sum = sum.add(v);
    }
    return sum;
  }
}

