package irvine.oeis.a008;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a006.A006657;
import irvine.util.Pair;

/**
 * A008828 Triangle read by rows: T(n,k) = number of closed meander systems of order n with k&lt;=n components.
 * @author Sean A. Irvine
 */
public class A008828 extends A006657 {

  {
    setOffset(1);
  }

  private int mN = 0;
  private int mM = 0;
  private Z[] mTotals = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mTotals = new Z[mN + 2];
      Arrays.fill(mTotals, Z.ZERO);
      final SimpleProcessor<Pair<Integer, Z>> processor = new SimpleProcessor<Pair<Integer, Z>>() {
        @Override
        protected Z total(final Iterable<Pair<Pair<Integer, Z>, Z>> counts) {
          for (final Pair<Pair<Integer, Z>, Z> e : counts) {
            final int components = e.left().left();
            mTotals[components] = mTotals[components].add(e.right());
          }
          return null; // not used
        }
      };
      processor.setCreateStateMachine(k -> new MeandersByComponents(k, mN + 1));
      processor.process(2 * mN, initialStates(null));
    }
    return mTotals[mM];
  }
}
