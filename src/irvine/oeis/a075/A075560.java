package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075540.
 * @author Sean A. Irvine
 */
public class A075560 extends Sequence1 {

  private static final class State {
    private final Z mN;
    private final long mSet;

    private State(final Z n, final long set) {
      mN = n;
      mSet = set;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mSet == other.mSet && other.mN.equals(mN);
    }

    @Override
    public int hashCode() {
      return mN.hashCode() + Long.hashCode(mSet);
    }
  }

  private final HashSet<State> mProducts = new HashSet<>();
  private final HashSet<State> mSums = new HashSet<>();
  private final HashSet<Z> mSumsValues = new HashSet<>();
  private Z mA = Z.ONE;
  private int mN = -1;
  {
    mProducts.add(new State(Z.ONE, 0L));
    mSums.add(new State(Z.ZERO, 0L));
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final long bit = 1L << mN;
    while (mSumsValues.remove(mA)) {
      mA = mA.add(1);
    }
    final HashSet<State> newProducts = new HashSet<>();
    for (final State p : mProducts) {
      final long set = p.mSet | bit;
      final Z v = p.mN.multiply(mA);
      final State t = new State(v, set);
      if (!mProducts.contains(t)) {
        final HashSet<State> newSums = new HashSet<>();
        for (final State s : mSums) {
          if ((s.mSet & set) == 0) {
            final Z u = v.add(s.mN);
            newSums.add(new State(u, s.mSet | set));
            mSumsValues.add(u);
          }
        }
        mSums.addAll(newSums);
        newProducts.add(t);
      }
    }
    mProducts.addAll(newProducts);
    return mA;
  }
}

