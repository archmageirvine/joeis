package irvine.oeis.a390;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390875 Positive integers k for which the 3-node triangle parity-routing process modulo k, starting from (1,1,1), does not halt for at least one of the 8 routing rules.
 * @author Sean A. Irvine
 */
public class A390875 extends Sequence1 {

  /*
  Three nodes sit on a triangle, each starting with value 1. At each step, the active node sends its value to its left or right neighbor based on the parity of its value and a per-node rule bit. The receiving node adds the sent value modulo k; if the result is 0, the process halts, otherwise the receiver becomes the new active node. With 3 nodes and 2 choices (left/right) per node, there are 2^3 = 8 possible rule sets. The sequence lists values of n for which at least one of the 8 rule sets causes the process to cycle forever instead of halting.
   */

  private static final class State {

    private final long[] mValues;
    private final int mActive;

    State(final long[] values, final int active) {
      mValues = values;
      mActive = active;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State s = (State) obj;
      return s.mActive == mActive && Arrays.equals(s.mValues, mValues);
    }

    @Override
    public int hashCode() {
      return (Arrays.hashCode(mValues) << 2) + mActive;
    }

    @Override
    public String toString() {
      return Arrays.toString(mValues) + " " + mActive;
    }
  }

  private long mN = 0;

  private boolean is(final long mod, final int rule) {
    final HashSet<State> seen = new HashSet<>();
    State s = new State(new long[] {1, 1, 1}, 0);
    while (seen.add(s)) {
      final int active = s.mActive;
      final long val = s.mValues[active];
      final int next = (active + 1 + ((int) (val & 1) ^ ((rule >> active) & 1))) % 3;
      final long[] v = s.mValues.clone();
      v[next] += val;
      v[next] %= mod;
      if (v[next] == 0) {
        return false;
      }
      s = new State(v, next);
      //System.out.println(mN + " " + Integer.toBinaryString(rule) + " " + s);
    }
    return true;
  }

  private boolean is(final long mod) {
    for (int rule = 0; rule < 8; ++rule) {
      if (is(mod, rule)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
