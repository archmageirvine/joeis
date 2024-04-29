package irvine.math.function;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Compute Bell numbers.
 * @author Sean A. Irvine
 */
class BellNumbers extends AbstractFunction1 {

  private final ArrayList<Z> mBellNumbers = new ArrayList<>();

  BellNumbers() {
    mBellNumbers.add(Z.ONE);
  }

  @Override
  public Z z(final Z n) {
    return z(n.intValueExact());
  }

  @Override
  public Z z(final int n) {
    if (n < 0) {
      throw new UnsupportedOperationException();
    }
    while (mBellNumbers.size() <= n) {
      Z sum = Z.ZERO;
      final int s = mBellNumbers.size();
      for (int k = 0; k < s; ++k) {
        sum = sum.add(mBellNumbers.get(k).multiply(Binomial.binomial(s - 1, k)));
      }
      mBellNumbers.add(sum);
    }
    return mBellNumbers.get(n);
  }

}
