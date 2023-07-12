package irvine.oeis.a105;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A105599 Triangle read by rows: T(n, m) = number of forests with n nodes and m labeled trees. Also number of forests with exactly n - m edges on n labeled nodes.
 * Also number of forests with exactly n - m edges on n labeled nodes.
 * @author Georg Fischer
 */
public class A105599 extends Triangle {

  /** Construct the sequence. */
  public A105599() {
    super(1);
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    T:= proc(n,m) option remember;
          if n<0 then 0
        elif n=m then 1
        elif m<1 or m>n then 0
        else add(binomial(n-1,j-1)*j^(j-2)*T(n-j,m-1), j=1..n-m+1)
          fi
        end:
    seq(seq(T(n, m), m=1..n), n=1..12);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == m) {
        return Z.ONE;
      }
      if (m < 1 || m > n) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n - m + 1;
      for (int j = 1; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(n - 1, j - 1).multiply(Z.valueOf(j).pow(j - 2)).multiply(get(n - j, m - 1)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return mB.get(n, k);
  }
}
