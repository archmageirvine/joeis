package irvine.oeis.a067;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067609 Number of stereo alkanes with combinatorial diameter n.
 * @author Sean A. Irvine
 */
public class A067609 extends Sequence1 {

  private int mN = 0;

  private Z f(final Z n, final int k) {
    return Binomial.binomial(n.add(k - 1), k).add(Binomial.binomial(n, k));
  }

  private final MemoryFunction1<Z> mRid = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return n == 0 ? Z.ONE : f(get(n - 1), 3).add(1);
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
    } else {
      final int r = (mN - 1) / 2;
      return f(mRid.get(r), 4)
        .subtract(rd(r).multiply(f(mRid.get((mN - 3) / 2), 3)))
        .subtract(f(mRid.get((mN - 3) / 2), 4));
    }
  }
}

