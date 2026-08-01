package irvine.oeis.a235;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A235154 Primes which have one or more occurrences of exactly two different digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A235154 extends Sequence1 {

  private final TreeSet<State> mStates = new TreeSet<>();

  private static final class State implements Comparable<State> {
    private final int mA;
    private final int mB;
    private final Z mN;

    private State(final int a, final int b, final Z n) {
      mA = a;
      mB = b;
      mN = n;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      final int d = Integer.compare(mA, state.mA);
      if (d != 0) {
        return d;
      }
      return Integer.compare(mB, state.mB);
    }
  }

  /** Construct the sequence. */
  public A235154() {
    for (int d1 = 1; d1 < 10; ++d1) {
      for (int d2 = 0; d2 < d1; ++d2) {
        mStates.add(new State(d1, d2, Z.ZERO));
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mStates.pollFirst();
      final Z n = s.mN;
      final Z m = n.multiply(10);
      mStates.add(new State(s.mA, s.mB, m.add(s.mA)));
      if (!n.isZero() || s.mB != 0) {
        mStates.add(new State(s.mA, s.mB, m.add(s.mB)));
      }
      if (n.isProbablePrime() && Integer.bitCount(Functions.SYNDROME.i(n)) > 1) {
        return n;
      }
    }
  }
}
