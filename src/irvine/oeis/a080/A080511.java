package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080511 Triangle whose n-th row contains the least set (ordered lexicographically) of n distinct positive integers whose arithmetic mean is an integer.
 * @author Sean A. Irvine
 */
public class A080511 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected Z[] mRow = null;

  private Z minMultiplicativeComponent(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    Z min = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      min = min.multiply(p.pow((mN - e % mN) % mN));
    }
    return min;
  }

  protected void step() {
    if (++mN == 1) {
      mRow = new Z[] {Z.ONE};
      return;
    }
    mRow = new Z[mN];
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      mRow[k - 1] = Z.valueOf(k);
      sum = sum.add(k);
    }
    long i = mN - 1;
    while (true) {
      if (sum.add(++i).mod(mN) == 0) {
        mRow[mRow.length - 1] = Z.valueOf(i);
        return;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
    }
    return mRow[mM];
  }
}

