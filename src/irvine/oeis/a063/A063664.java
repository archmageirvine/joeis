package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008594;
import irvine.util.Pair;

/**
 * A063664 Numbers whose reciprocal is the sum of two reciprocals of squares.
 * @author Sean A. Irvine
 */
public class A063664 extends A063663 {

  private final Sequence mB = new A008594();
  {
    mB.next();
    super.next();
  }
  private Z mT = mB.next().square();
  private Z mS = super.next();
  private Z mPrev = Z.ZERO;
  private final TreeSet<State> mA = new TreeSet<>();

  private static final class State extends Pair<Z, Long> implements Comparable<State> {

    private State(final Z n, final long d) {
      super(n, d);
    }

    @Override
    public int compareTo(final State state) {
      final int c = left().compareTo(state.left());
      return c != 0 ? c : right().compareTo(state.right());
    }
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().left().compareTo(mS) >= 0) {
        mA.add(new State(mS, 1));
        mS = super.next();
      }
      while (mA.isEmpty() || mA.first().left().compareTo(mT) >= 0) {
        mA.add(new State(mT, 0));
        mT = mB.next().square();
      }
      final State s = mA.pollFirst();
      final Z n = s.left();
      final long d = s.right();
      if (d > 0) {
        mA.add(new State(n.divide(d).divide(d).multiply(d + 1).multiply(d + 1), d + 1));
      }
      if (!n.equals(mPrev)) {
        mPrev = n;
        return n;
      }
    }
  }
}
