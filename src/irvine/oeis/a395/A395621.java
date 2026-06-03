package irvine.oeis.a395;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395621 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A395621 extends Sequence1 {

  private CR mBest = CR.ONE;
  private int mM = 2;
  private final MemoryFunction1<CR> mSquareRoots = new MemoryFunction1<>() {
    @Override
    protected CR compute(final int n) {
      return CR.valueOf(n).sqrt();
    }
  };

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE.is(++mM)) {
        boolean improvement = false;
        final CR rc = mSquareRoots.get(mM);
        for (int k = 2; k < mM; ++k) {
          if (!Predicates.SQUARE.is(k)) {
            final CR r = rc.add(mSquareRoots.get(k)).frac();
            final CR t = r.min(CR.ONE.subtract(r));
            if (t.compareTo(mBest) < 0) {
              mBest = t;
              improvement = true;
            }
          }
        }
        if (improvement) {
          return Z.valueOf(mM);
        }
      }
    }
  }
}
