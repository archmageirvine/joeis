package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A082554 Primes whose base-2 representation is a block of 1's, followed by a block of 0's, followed by a block of 1's.
 * @author Sean A. Irvine
 */
public class A082554 extends Sequence1 {

  private static final class State extends Triple<Integer> implements Comparable<State> {

    private final Z mN;

    private State(final int a, final int b, final int c) {
      super(a, b, c);
      mN = Z.ONE.shiftLeft(a).subtract(Z.ONE.shiftLeft(b)).add(Z.ONE.shiftLeft(c)).subtract(1);
    }

    @Override
    public int compareTo(final State myTriple) {
      return mN.compareTo(myTriple.mN);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(3, 2, 1));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      mA.add(new State(s.left() + 1, s.mid() + 1, s.right()));
      if (s.mid() - 1 > s.right()) {
        mA.add(new State(s.left(), s.mid() - 1, s.right()));
      }
      if (s.right() + 1 < s.mid()) {
        mA.add(new State(s.left(), s.mid(), s.right() + 1));
      }
      if (s.mN.isProbablePrime()) {
        return s.mN;
      }
    }
  }
}
