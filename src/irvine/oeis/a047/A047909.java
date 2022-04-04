package irvine.oeis.a047;

import irvine.math.MemoryFunctionInt5;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047909 Array read by antidiagonals upwards: h(n,k) = number of sequences with n copies each of 1,2,...,k and longest increasing subsequence of length k (n&gt;=1, k&gt;=1).
 * @author Sean A. Irvine
 */
public class A047909 extends MemoryFunctionInt5<Q> implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Q compute(final int k, final int p, final int j, final int l, final int t) {
    if (k == 0) {
      return new Q(Z.ONE, (t & 1) == 0 ? mF.factorial(l) : mF.factorial(l).negate());
    }
    if (p < 0) {
      return Q.ZERO;
    }
    Q sum = Q.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(get(k - i, p - 1, j + 1, l + i * j, (t + i * j) & 1).divide(mF.factorial(i).multiply(mF.factorial(p).pow(i))));
    }
    return sum;
  }

  private Z h(final int p, final int k) {
    return get(k, p - 1, 1, 0, k & 1).multiply(mF.factorial(k)).multiply(mF.factorial(p * k)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return h(1 + mN - mM, mM);
  }
}
