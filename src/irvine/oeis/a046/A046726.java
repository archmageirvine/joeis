package irvine.oeis.a046;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A046726 Triangle of numbers of semi-meanders of order n with k components.
 * @author Sean A. Irvine
 */
public class A046726 extends A046721 {

  private int mN = 0;
  private int mM = 0;
  private Z[] mTotals = null;

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
      mTotals = new Z[mN + 1];
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
      processor.process(mN, initialStates(new MeandersByComponents(mN, components())));
    }
    return mTotals[mM];
  }
}
