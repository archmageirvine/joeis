package irvine.oeis.a079;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079298 Binomial numbers: of the form a^k +- b^k for k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A079298 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mA;
    private final long mB;
    private final long mK;
    private final int mSign;

    private State(final long a, final long b, final long k, final int sign) {
      mA = a;
      mB = b;
      mK = k;
      mSign = sign;
      mN = Z.valueOf(a).pow(k).add(Z.valueOf(b).pow(k).multiply(sign));
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mK, state.mK);
      if (d != 0) {
        return d;
      }
      final int e = Integer.compare(mSign, state.mSign);
      if (e != 0) {
        return e;
      }
      return Long.compare(mB, state.mB);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mB == other.mB && mK == other.mK && mSign == other.mSign;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }

    @Override
    public String toString() {
      return mN + " = " + mA + "^" + mK + (mSign == 1 ? "+" : "-") + mB + "^" + mK;
    }
  }

  // mA maintains terms yet to be output in numerical order
  private final TreeSet<State> mA = new TreeSet<>();
  // Used to suppress multiple outputs of the same term when there is more than representation
  private Z mPrev = null;
  {
    mA.add(new State(0, 0, 2, 1));
    mA.add(new State(0, 0, 2, -1));
  }

  private void add(final State state) {
    if (mPrev == null || state.mN.compareTo(mPrev) >= 0) {
      mA.add(state);
    }
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      final Z t = mPrev;
      mPrev = s.mN;
      add(new State(s.mA + 1, s.mSign == 1 ? 0 : s.mA, s.mK, s.mSign));
      if (s.mSign == 1) {
        if (s.mB < s.mA) {
          add(new State(s.mA, s.mB + 1, s.mK, s.mSign));
        }
      } else if (s.mSign == -1 && s.mB > 0) {
        add(new State(s.mA, s.mB - 1, s.mK, s.mSign));
      }
      if (s.mB > 1) {
        add(new State(s.mA, s.mB, s.mK + 1, s.mSign));
      }
      if (!mPrev.equals(t)) {
        return mPrev;
      }
    }
  }
}
