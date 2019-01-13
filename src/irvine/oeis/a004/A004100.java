package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001832;

/**
 * A004100.
 * @author Sean A. Irvine
 */
public class A004100 extends A001832 {

  private final ArrayList<Z> mD = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();
  {
    mD.add(null);
    mB.add(null);
  }

  private final MemoryFunction2<Integer, Z> mG = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer p, final Integer j) {
      if (j == 1) {
        return mD.get(p + 1);
      }
      Z sum = Z.ZERO;
      for (int i = 0; i <= p; ++i) {
        sum = sum.add(Binomial.binomial(p, i).multiply(mD.get(p + 1 - i)).multiply(get(i, j - 1)));
      }
      return sum;
    }
  };

  private final MemoryFunction1<Z> mH = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int p) {
      if (p == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int i = 1; i < p; ++i) {
        sum = sum.add(Binomial.binomial(p - 1, i - 1).multiply(get(i)).multiply(mD.get(p + 1 - i)));
      }
      return mD.get(p + 1).subtract(sum);
    }
  };

  @Override
  public Z next() {
    final int p = mD.size();
    mD.add(super.next());
    Z res = mH.get(p - 1);
    for (int j = 1; j < p - 1; ++j) {
      res = res.subtract(Binomial.binomial(p - 1, j).multiply(mB.get(j + 1)).multiply(mG.get(p - j - 1, j)));
    }
    mB.add(res);
    return res;
  }
}

