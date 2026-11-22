package irvine.oeis.a125;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A125127 Array L(k,n) read by antidiagonals: k-step Lucas numbers.
 * @author Gregory Morse
 */
public class A125127 extends Sequence1 {
  private int mN = 0;
  private int mK = 0;
  private final MemoryFunctionInt2<Z> mLucas = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int k, final int n) {
      if (n == 0) {
        return Z.valueOf(k);
      }
      if (n <= k) {
        return Z.ONE.shiftLeft(n).subtract(1);
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        sum = sum.add(get(k, n - j));
      }
      return sum;
    }
  };

  protected final Z lucas(final int k, final int n) {
    return mLucas.get(k, n);
  }

  protected Z t(final int k, final int n) {
    return lucas(k, n);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return t(mN + 1 - mK, mK);
  }
}
