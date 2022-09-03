package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058865 Triangle a(n,k) giving number of connected labeled chordal graphs on n nodes with k edges, containing no induced path P_4, for n &gt;= 2, 1 &lt;= k &lt;= n(n-1)/2; also the number of labeled trees with each vertex replaced by a clique.
 * @author Sean A. Irvine
 */
public class A058865 implements Sequence {

  // Thanks to M. F. Hasler

  private int mN = 1;
  private int mM = 1;

  // A(n,q) = a(n,q) + (1/n)*Sum_{k = 1..n-1} k*binomial(n,k)*Sum_{l = k-1..min(k(k-1)/2, q)} a(k,l)*A(n-k,q-l). [Simplified by M. F. Hasler, Sep 03 2022]
  private final MemoryFunctionInt2<Z> mBigA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int q) {
      Z sum = Z.ZERO;
      for (int k = 1; k <= n - 1; ++k) {
        final int kk = k;
        final Z s = Integers.SINGLETON.sum(k - 1, Math.min(k * (k - 1) / 2, q), l -> mLittleA.get(kk, l).multiply(mBigA.get(n - kk, q - l)));
        sum = sum.add(s.multiply(Binomial.binomial(n, k).multiply(k)));
      }
      return mLittleA.get(n, q).add(sum.divide(n));
    }
  };

  // a(n,q) = Sum_{k=1..n-2} binomial(n,k)*(A(n-k, q - k(k-1)/2 - k(n-k)) - a(n-k, q - k(k-1)/2 - k(n-k))) for q < n(n-1)/2 =: T(n), a(n, T(n)) = 1. [Corrected by M. F. Hasler, Sep 03 2022]
  private final MemoryFunctionInt2<Z> mLittleA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      final int tn = n * (n - 1) / 2;
      if (m == tn) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> {
        final int t = m - k * (k - 1) / 2 - k * (n - k);
        return Binomial.binomial(n, k).multiply(mBigA.get(n - k, t).subtract(mLittleA.get(n - k, t)));
      });
    }
  };

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 1;
    }
    return mLittleA.get(mN, mM);
  }
}

