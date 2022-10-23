package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Triple;
import irvine.util.string.StringUtils;

/**
 * A059915 A sequence f(n) of positive integers is called an F-sequence (in memory of Fibonacci) if it satisfies f(0)=0, f(1)=1, f(2)=2 and for all n &gt; 2, either f(n) = f(n-1) + f(n-2) or f(n) = f(n-1) + f(n-3). A positive integer is called an F-number if it occurs in any F-sequence. Sequence gives numbers which are not F-numbers.
 * @author Sean A. Irvine
 */
public class A059915 extends Sequence0 {

  private static final class State extends Triple<Z> implements Comparable<State> {

    private State(final Z left, final Z mid, final Z right) {
      super(left, mid, right);
    }

    @Override
    public int compareTo(final State state) {
      final int c = left().compareTo(state.left());
      if (c != 0) {
        return c;
      }
      final int d = mid().compareTo(state.mid());
      if (d != 0) {
        return d;
      }
      return right().compareTo(state.right());
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.ZERO, Z.ONE, Z.TWO));
  }
  private Z mN = Z.ZERO;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mVerbose && mN.mod(10000) == 0) {
        StringUtils.message("Search complete to " + mN + " states: " + mA.size());
      }
      if (mA.first().left().compareTo(mN) > 0) {
        return mN;
      }
      while (mA.first().left().compareTo(mN) <= 0) {
        final State s = mA.pollFirst();
        mA.add(new State(s.mid(), s.right(), s.mid().add(s.right())));
        mA.add(new State(s.mid(), s.right(), s.left().add(s.right())));
      }
    }
  }
}
