package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392471 Triangle read by rows: T(n,k) is the number of nested cycle partitions of n labeled nodes into k components.
 * @author Sean A. Irvine
 */
public class A392471 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction1<Q> mNu = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n == 0) {
        return Q.ZERO;
      }
      Q sum = Q.ZERO;
      for (final Z p : Jaguar.factor(n).divisors()) {
        sum = sum.add(new Q(-1, p).pow(n / p.longValue() - 1));
      }
      return sum;
    }
  };

  private final MemoryFunction1<Q> mKappa = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n == 0) {
        return Q.ZERO;
      }
      Q sum = mNu.get(n);
      for (int m = 0; m <= n - 1; ++m) {
        sum = sum.add(get(n - 1 - m).multiply(mNu.get(m + 1)));
      }
      return sum.divide(n);
    }
  };

  private final MemoryFunctionInt2<Q> mRhoC = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int j) {
      if (n == 0) {
        return j == 0 ? Q.ONE : Q.ZERO;
      }
      Q sum = Q.ZERO;
      for (int m = 0; m < n; ++m) {
        sum = sum.add(get(n - 1 - m, j - 1).multiply(m + 1).multiply(mKappa.get(m + 1)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mRhoC.get(mN, mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
