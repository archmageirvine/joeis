package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066028 Largest prime which can be written as a sum of distinct primes &lt;= prime(n).
 * @author Sean A. Irvine
 */
public class A066028 extends Sequence1 {

  private int mN = 0;
  private Z mSum = Z.ZERO;

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mBitSet;

    private State(final Z n, final Z bitSet) {
      mN = n;
      mBitSet = bitSet;
    }

    @Override
    public int compareTo(final State state) {
      final int c = state.mN.compareTo(mN);
      if (c != 0) {
        return c;
      }
      return mBitSet.compareTo(state.mBitSet);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mBitSet.equals(other.mBitSet);
    }

    @Override
    public int hashCode() {
      return mN.hashCode() + mBitSet.hashCode();
    }
  }

  @Override
  public Z next() {
    mSum = mSum.add(Functions.PRIME.l(++mN));
    final TreeSet<State> states = new TreeSet<>();
    states.add(new State(mSum, Z.ONE.shiftLeft(mN).subtract(1)));
    while (true) {
      final State s = states.pollFirst();
      if (s.mN.isProbablePrime()) {
        return s.mN;
      }
      for (int k = 0; k < mN; ++k) {
        if (s.mBitSet.testBit(k)) {
          states.add(new State(s.mN.subtract(Functions.PRIME.l(k + 1)), s.mBitSet.clearBit(k)));
        }
      }
    }
  }
}
