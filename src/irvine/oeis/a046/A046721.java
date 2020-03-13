package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a006.A006657;
import irvine.util.Pair;

/**
 * A046721 Number of semi-meanders of order n with 2 components.
 * @author Sean A. Irvine
 */
public class A046721 extends A006657 {

  @Override
  protected Iterable<Pair<Integer, Z>> initialStates(final MeandersByComponents mbc) {
    return mbc.semiMeanderInitialStates(k -> Boolean.TRUE);
  }

  private int mN = components() - 1;

  @Override
  public Z next() {
    ++mN;
    final SimpleProcessor<Pair<Integer, Z>> processor = new SimpleProcessor<Pair<Integer, Z>>() {
      @Override
      protected Z total(final Iterable<Pair<Pair<Integer, Z>, Z>> counts) {
        Z count = Z.ZERO;
        for (final Pair<Pair<Integer, Z>, Z> e : counts) {
          if (e.left().left() == components()) {
            count = count.add(e.right());
          }
        }
        return count;
      }
    };
    processor.setCreateStateMachine(k -> new MeandersByComponents(k, components()));
    return processor.process(mN, initialStates(new MeandersByComponents(mN, components())));
  }
}
