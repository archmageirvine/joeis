package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080508 Triangle whose n-th row contains the least set (ordered lexicographically) of n distinct positive integers whose geometric mean is an integer.
 * @author Sean A. Irvine
 */
public class A080508 extends Sequence1 {

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
    Z prod = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      mRow[k - 1] = Z.valueOf(k);
      prod = prod.multiply(k);
    }
    final Z mc = minMultiplicativeComponent(prod);
    long i = 0;
    while (true) {
      final Z t = mc.multiply(Z.valueOf(++i).pow(mN));
      if (t.compareTo(mN - 1) > 0) {
        mRow[mRow.length - 1] = t;
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

