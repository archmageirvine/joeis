package irvine.oeis.a072;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072398 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunction1<Q> mPiConvergents = new MemoryFunction1<>() {
    private final Convergents mConv = new Convergents(CR.PI);

    @Override
    protected Q compute(final int n) {
      return mConv.next();
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Z d = Z.TEN.pow(++mN);
    for (int k = 2 * mN; true; --k) {
      final Q c = mPiConvergents.get(k);
      if (c.den().compareTo(d) <= 0) {
        return select(c);
      }
    }
  }
}
