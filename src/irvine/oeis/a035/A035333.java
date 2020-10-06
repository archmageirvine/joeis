package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035333 Concatenation of two or more consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A035333 implements Sequence {

  private static final class State implements Comparable<State> {
    private final Z mV;
    private final long mLast;

    private State(final Z v, final long last) {
      mV = v;
      mLast = last;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mV.compareTo(o.mV);
      return c != 0 ? c : Long.compare(mLast, o.mLast);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && mV.equals(((State) obj).mV) && mLast == ((State) obj).mLast;
    }

    @Override
    public int hashCode() {
      return mV.hashCode();
    }

    @Override
    public String toString() {
      return "(" + mV + "," + mLast + ")";
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mV.longValueExact() > mN) {
        mA.add(new State(Z.valueOf(mN), mN));
        ++mN;
      }
      final State s = mA.pollFirst();
      final long last = s.mLast;
      mA.add(new State(new Z(s.mV.toString() + (last + 1)), last + 1));
      if (s.mV.longValueExact() != last) {
        return s.mV;
      }
    }
  }
}

