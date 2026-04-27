package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084577 Let y = m/GK(k), where m and k vary over the positive integers and GK(k)=log(1+1/(k*(k+2)))/log(2) is the Gauss-Kuzmin distribution of k. Sort the y values by size and number them consecutively by n. This sequence gives the values of floor(y) in order by n.
 * @author Sean A. Irvine
 */
public class A084577 extends Sequence1 {

  static final class State implements Comparable<State> {
    final CR mX;
    final long mM;
    final long mK;

    State(final long m, final long k) {
      mM = m;
      mK = k;
      mX = CR.valueOf(mM).divide(CR.valueOf(Q.ONE.add(new Q(1, mK * (mK + 2)))).log().divide(CR.LOG2));
    }

    @Override
    public int compareTo(final State state) {
      if (mM == state.mM && mK == state.mK) {
        return 0;
      }
      return mX.compareTo(state.mX);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mM == other.mM && mK == other.mK;
    }

    @Override
    public int hashCode() {
      return (int) (mM * 31 + mK);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(1, 1));
  }

  protected Z select(final State s) {
    return s.mX.floor();
  }

  @Override
  public Z next() {
    final State s = mA.pollFirst();
    mA.add(new State(s.mM + 1, s.mK));
    mA.add(new State(s.mM, s.mK + 1));
    return select(s);
  }
}

