package irvine.oeis.a384;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384118 Array read by antidiagonals: T(n,m) is the number of minimal total dominating sets in the n X m rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A384118 extends Sequence0 {
  // After Andrew Howroyd.
  private int mN = 0;
  private int mK = -1;
  private final MemoryFunctionInt2<Z> mOriented = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ZERO;
      }
      if (m == 0) {
        return Z.ONE;
      }
      Z sum = n > 2 ? Binomial.binomial(n, 2).multiply(get(n - 2, m - 1)) : Z.ZERO;
      for (int i = 2; i <= m; ++i) {
        Z count = get(n - 1, m - i).multiply(n);
        if (i >= 3 && i <= n) {
          count = count.add(Binomial.binomial(n, i - 1).multiply(Functions.FACTORIAL.z(i)).multiply(get(n - i + 1, m - i)));
        }
        sum = sum.add(Binomial.binomial(m - 1, i - 1).multiply(count));
      }
      return sum;
    }
  };

  protected final Z total(final int n, final int m) {
    if (n + m == 0) {
      return Z.ONE;
    }
    final Z a = mOriented.get(n, m).add(mOriented.get(m, n));
    if ((n + m) % 3 != 0 || n > 2 * m || m > 2 * n) {
      return a;
    }
    final int t = (n + m) / 3;
    return a.add(Binomial.binomial(n, m - t).multiply(Binomial.binomial(m, n - t))
      .multiply(Functions.FACTORIAL.z(2L * (n - t))).multiply(Functions.FACTORIAL.z(2L * (m - t))).shiftRight(t));
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return total(mK, mN - mK);
  }
}
