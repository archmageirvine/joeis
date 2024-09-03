package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072103 Sorted perfect powers a^b for a, b &gt; 1 with duplication.
 * @author Sean A. Irvine
 */
public class A072103 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mB;

    private State(final Z n, final Z b) {
      mN = n;
      mB = b;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return mB.compareTo(state.mB);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mB.equals(other.mB);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }

    private State next() {
      return new State(mN.multiply(mB), mB);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.FOUR, Z.TWO));
  }
  private Z mN = Z.THREE;

  @Override
  public Z next() {
    final Z sq = mN.square();
    if (sq.compareTo(mA.first().mN) <= 0) {
      mA.add(new State(sq, mN));
      mN = mN.add(1);
    }
    final State s = mA.pollFirst();
    mA.add(s.next());
    return s.mN;
  }
}
