package irvine.oeis.a395;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395622 Nonsquare integers c &gt; 0 for which there are positive nonsquare numbers a &lt; b &lt; c such that sqrt(a) + sqrt(b) + sqrt(c) is closer to an integer than for all smaller nonsquare c &gt; b &gt; a &gt; 0.
 * @author Sean A. Irvine
 */
public class A395622 extends Sequence1 {

  private CR mBest = CR.ONE;
  private int mC = 4;
  private final MemoryFunction1<CR> mSquareRoots = new MemoryFunction1<>() {
    @Override
    protected CR compute(final int n) {
      return CR.valueOf(n).sqrt();
    }
  };

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE.is(++mC)) {
        boolean improvement = false;
        final CR rc = mSquareRoots.get(mC);
        for (int b = 3; b < mC; ++b) {
          if (!Predicates.SQUARE.is(b)) {
            final CR rb = rc.add(mSquareRoots.get(b));
            for (int a = 2; a < b; ++a) {
              if (!Predicates.SQUARE.is(a)) {
                final CR r = rb.add(mSquareRoots.get(a)).frac();
                final CR t = r.min(CR.ONE.subtract(r));
                if (t.compareTo(mBest) < 0) {
                  mBest = t;
                  improvement = true;
                }
              }
            }
          }
        }
        if (improvement) {
          return Z.valueOf(mC);
        }
      }
    }
  }
}
