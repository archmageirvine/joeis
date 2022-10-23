package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A057896 Nonnegative numbers that can be written as m^k - m (with m and k nonnegative) in more than one way.
 * @author Sean A. Irvine
 */
public class A057896 extends Sequence1 {

  private static final class State extends Pair<Integer, Integer> implements Comparable<State> {

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
      return Z.valueOf(left()).pow(right()).subtract(left());
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(1, 1));
    mA.add(new State(2, 1));
  }

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
      if (!res.equals(mPrev)) {
        mPrev = res;
      } else {
        return res;
      }
    }
  }
}

