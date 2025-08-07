package irvine.oeis.a383;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052486;
import irvine.util.Pair;

/**
 * A383394 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A383394 extends Sequence1 {

  private static final class State extends Pair<Z, Z> implements Comparable<Pair<Z, Z>> {

    /**
     * Construct a new state.
     * @param n value
     * @param b base
     */
    public State(final Z n, final Z b) {
      super(n, b);
    }

    @Override
    public int compareTo(final Pair<Z, Z> pair) {
      final int c = left().compareTo(pair.left());
      if (c != 0) {
        return c;
      }
      return right().compareTo(pair.right());
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return left().equals(other.left()) && right().equals(other.right());
    }

    @Override
    public int hashCode() {
      return left().hashCode();
    }
  }

  private final Sequence mParent;
  private final TreeSet<State> mA = new TreeSet<>();
  private Z mT;

  protected A383394(final Sequence parent) {
    mParent = parent;
    mT = mParent.next();
  }

  /** Construct the sequence. */
  public A383394() {
    this(new A052486());
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().left().compareTo(mT.square()) >= 0) {
      mA.add(new State(mT.square(), mT));
      mT = mParent.next();
    }
    final State s = mA.pollFirst();
    mA.add(new State(s.left().multiply(s.right()), s.right()));
    return s.left();
  }
}
