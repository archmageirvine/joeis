package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A057897 Numbers which can be written as m^k-k, with m, k &gt; 1.
 * @author Sean A. Irvine
 */
public class A057897 implements Sequence {

  private static class State extends Pair<Integer, Integer> implements Comparable<State> {

    private State(final int base, final int exponent) {
      super(base, exponent);
    }

    @Override
    public int compareTo(final State state) {
      final int c = get().compareTo(state.get());
      if (c != 0) {
        return c;
      }
      return left().compareTo(right());
    }

    private Z get() {
      return Z.valueOf(left()).pow(right()).subtract(right());
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private int mN = 2;
  private Z mPrev = null;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(mN).square().subtract(mN);
      if (mA.isEmpty() || mA.first().get().compareTo(t) >= 0) {
        mA.add(new State(mN, 2));
        ++mN;
      }
      final State s = mA.pollFirst();
      if (s.right() > 1) {
        mA.add(new State(s.left(), s.right() + 1));
      }
      final Z res = s.get();
      // Note: It is suspected that all values here are distinct
      if (!res.equals(mPrev)) {
        mPrev = res;
        return res;
      }
    }
  }
}

