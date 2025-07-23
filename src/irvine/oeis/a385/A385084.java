package irvine.oeis.a385;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385084 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A385084 extends Sequence1 {

  private static final int ACCURACY = -1000;
  private static final class State implements Comparable<State> {

    private final int[] mV;
    private final long mSS;
    private final CR mD;

    private State(final int[] v) {
      mV = v;
      long s = 0;
      long ss = 0;
      for (final int e : v) {
        ss += (long) e * e;
        s += e;
      }
      mSS = ss;
      mD = CR.valueOf(ss).sqrt().add(s);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mD.compareTo(state.mD, ACCURACY);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mV, state.mV);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mD.compareTo(other.mD, ACCURACY) == 0 && Arrays.equals(mV, other.mV);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mV);
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    final TreeSet<State> states = new TreeSet<>();
    final int[] v = new int[++mN];
    Arrays.fill(v, 1);
    states.add(new State(v));
    while (true) {
      final State s = states.pollFirst();
      final int[] vec = s.mV;
      if (Predicates.SQUARE.is(s.mSS)) {
        return Z.valueOf(Functions.SQRT.l(s.mSS) + Functions.SUM.l(vec));
      }
      for (int k = 0; k < mN; ++k) {
        if (k == mN - 1 || vec[k] < vec[k + 1]) {
          final int[] copy = Arrays.copyOf(vec, mN);
          ++copy[k];
          states.add(new State(copy));
        }
      }
    }
  }
}
