package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068801 Primes that can be formed by concatenating 2^a and 3^b.
 * @author Sean A. Irvine
 */
public class A068801 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mA;
    private final Z mB;

    private State(final Z a, final Z b) {
      mN = new Z(a.toString() + b.toString());
      mA = a;
      mB = b;
    }

    @Override
    public int compareTo(final State state) {
      return mN.compareTo(state.mN);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mA.equals(other.mA) && mB.equals(other.mB);
    }
  }

  private final TreeSet<State> mSet = new TreeSet<>();
  {
    mSet.add(new State(Z.ONE, Z.ONE));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mSet.pollFirst();
      mSet.add(new State(s.mA.multiply2(), s.mB));
      mSet.add(new State(s.mA, s.mB.multiply(3)));
      if (s.mN.isProbablePrime()) {
        return s.mN;
      }
    }
  }
}
