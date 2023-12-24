package irvine.oeis.a067;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067608 Number of structural alkanes with combinatorial diameter n.
 * @author Sean A. Irvine
 */
public class A067608 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Z> mRid = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return n == 0 ? Z.ONE : Binomial.binomial(get(n - 1).add(2), 3).add(1);
    }
  };

  private Z rd(final int n) {
    return mRid.get(n).subtract(mRid.get(n - 1));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      return Binomial.binomial(rd(mN / 2).add(1), 2);
    } else{
      final int r = (mN - 1) / 2;
      return Binomial.binomial(mRid.get(r).add(3), 4)
        .subtract(rd(r).multiply(Binomial.binomial(mRid.get((mN - 3) / 2).add(2), 3)))
        .subtract(Binomial.binomial(mRid.get((mN - 3) / 2).add(3), 4));
    }
  }
}

