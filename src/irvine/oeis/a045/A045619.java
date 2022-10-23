package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A045619 Numbers that are the products of 2 or more consecutive integers.
 * @author Sean A. Irvine
 */
public class A045619 extends Sequence1 {

  private static final class State extends Pair<Z, Long> implements Comparable<State> {

    private State(final Z n, final Long t) {
      super(n, t);
    }

    @Override
    public int compareTo(final State o) {
      final int c = left().compareTo(o.left());
      if (c != 0) {
        return c;
      }
      if (right() == null) {
        return 1;
      }
      if (o.right() == null) {
        return -1;
      }
      return right().compareTo(o.right());
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.ZERO, null));
    mA.add(new State(Z.TWO, null));
  }
  private long mN = 2;
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      if (mA.isEmpty() || mA.first().left().compareTo(Z.valueOf(mN * (mN + 1))) > 0) {
        mA.add(new State(Z.valueOf(mN * ++mN), mN));
      }
      final State e = mA.pollFirst();
      final Z m = e.left();
      if (e.right() != null) {
        mA.add(new State(m.multiply(e.right() + 1), e.right() + 1));
      }
      if (!mPrev.equals(m)) {
        mPrev = m;
        return m;
      }
    }
  }
}
