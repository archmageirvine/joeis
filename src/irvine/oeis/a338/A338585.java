package irvine.oeis.a338;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt3;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A338585 Number of partitions of the n-th triangular number into exactly n positive triangular numbers.
 * @author Georg Fischer
 */
public class A338585 extends Sequence0 {

  protected int mN = -1;

  protected final MemoryFunction1<Integer> mH = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < 1) {
        return 0;
      }
      return Predicates.SQUARE.is(8L * n + 1) ? Integer.valueOf(n) : get(n - 1);
    }
  };

  protected final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      if (i * k < n || k > n) {
        return Z.ZERO;
      }
      return get(n, mH.get(i - 1), k).add(get(n - i, mH.get(Math.min(i, n - i)), k - 1));
    }
  };

  @Override
  public Z next() {
    ++mN;
    final int t = mN * (mN + 1) / 2;
    return mB.get(t, mH.get(t), mN);
  }
}
