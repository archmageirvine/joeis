package irvine.oeis.a064;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A064413 EKG sequence (or ECG sequence): a(1) = 1; a(2) = 2; for n &gt; 2, a(n) = smallest number not already used which shares a factor with a(n-1).
 * @author Sean A. Irvine
 */
public class A064413 extends Sequence1 {

  protected final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  private static final class State extends Pair<Z, Z> implements Comparable<State> {

    private State(final Z n, final Z p) {
      super(n, p);
    }

    @Override
    public int compareTo(final State state) {
      final int c = left().compareTo(state.left());
      if (c != 0) {
        return c;
      }
      return right().compareTo(state.right());
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mSeen.add(Z.TWO);
      mA = Z.TWO;
      return mA;
    }
    final TreeSet<State> set = new TreeSet<>();
    for (final Z p : Jaguar.factor(mA).toZArray()) {
      set.add(new State(p, p));
    }
    while (true) {
      final State s = set.pollFirst();
      final Z k = s.left();
      if (mSeen.add(k)) {
        mA = k;
        return k;
      }
      set.add(new State(k.add(s.right()), s.right()));
    }
  }
}
