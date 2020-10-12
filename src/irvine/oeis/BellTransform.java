package irvine.oeis;

import java.util.List;

import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.z.Binomial;

/**
 * Bell transform.
 * @author Sean A. Irvine
 */
public class BellTransform extends MemoryFunction2<Integer, Q> {

  private final List<Q> mA;

  /**
   * Bell transform.
   * @param a first sequence
   */
  public BellTransform(final List<Q> a) {
    mA = a;
  }

  @Override
  protected Q compute(final Integer n, final Integer k) {
    if (k == 0) {
      return mA.get(0).pow(n);
    }
    Q sum = Q.ZERO;
    for (int j = 0; j <= n - k + 1; ++j) {
      sum = sum.add(mA.get(j).multiply(Binomial.binomial(n - 1, j - 1)).multiply(get(n - j, k - 1)));
    }
    return sum;
  }
}
