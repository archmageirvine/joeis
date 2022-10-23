package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicArray;

/**
 * A006568 Denominators of generalized Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A006568 extends Sequence0 {

  private final DynamicArray<Q> mC = new DynamicArray<>();
  private Z mF = Z.ONE;
  private int mN = -1;
  {
    mC.set(0, Q.ONE);
  }

  private Q sum(final DynamicArray<Q> c, final int start, final int end) {
    Q sum = Q.ZERO;
    for (int k = start; k <= end; ++k) {
      sum = sum.add(c.get(k));
    }
    return sum;
  }

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    for (int k = mN; k > 0; --k) {
      mC.set(k, mC.get(k - 1).divide(k + 2));
    }
    mC.set(0, sum(mC, 1, mN).negate());
    return select(mC.get(0).multiply(mF));
  }
}
