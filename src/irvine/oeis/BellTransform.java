package irvine.oeis;

import java.util.ArrayList;

import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.z.Binomial;

/**
 * Bell transform.
 * @author Sean A. Irvine
 */
public class BellTransform extends MemoryFunction2<Integer, Q> {

  private final ArrayList<Q> mA;

  /**
   * Bell transform.
   * @param a first sequence
   */
  public BellTransform(final ArrayList<Q> a) {
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

/*
def bell_trans(n,k,a):
    @cached_function
    def T(n, k):
        if k==0: return a[0]^n
        return sum(binomial(n-1,j-1)*a[j]*T(n-j,k-1) for j in (0..n-k+1))
    return T(n,k)
 */
