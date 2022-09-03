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

  private int mN = 1;
  private int mM = 1;

  private final MemoryFunctionInt2<Z> mBigA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int q) {
//      if (n == 1) {
//        return q >= 0 ? Z.ONE : Z.ZERO;
//        //return Z.ONE;
//      }
//      if (n == 2) {
//        return q == 1 ? Z.TWO : Z.ZERO;
//      }
      Z sum = Z.ZERO;
      for (int l = 0; l <= q; ++l) {
//        final int j = l;
//        sum = sum.add(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n, k).multiply(k).multiply(mLittleA.get(k, j)).multiply(mBigA.get(n - k, q - j))));
        Z s = Z.ZERO;
        for (int k = 1; k <= n - 1; ++k) {
          s = s.add(Binomial.binomial(n, k).multiply(k).multiply(mLittleA.get(k, l)).multiply(mBigA.get(n - k, q - l)));
        }
        sum = sum.add(s);
      }
      return mLittleA.get(n, q).add(sum.divide(n));
    }
  };

  private final MemoryFunctionInt2<Z> mLittleA = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      System.out.println("Computing a(" + n + "," + m + ")");
      if (n == 2 && m == 1) {
        return Z.ONE;
      }
      if (m == n - 1) {
        return Z.valueOf(n);
      }
      if (n <= 2) {
        if (n == 1) {
          return m == 0 ? Z.ONE : Z.ZERO;
        }
        //return n == 2 && m == 1 ? Z.ONE : Z.ZERO;
      }
//    if (m > n * (n - 1) / 2) {
//      return Z.ZERO;
//    }
      if (m == n * (n - 1) / 2) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> {
        final int t = m - k * (k - 1) / 2 - k * (n - k);
        return t <= 0 ? Z.ZERO : Binomial.binomial(n, k).multiply(mBigA.get(n - k, t).subtract(mLittleA.get(n - k, t)));
      });
    }
  };

  /*

Let A(n,k) be the number if the graphs need not be connected; then

A(n,q) = a(n,q) + Sum_{l=0..q} (1/n)(Sum_{k=1..n-1} k*binomial(n,k)*a(k,l)*A(n-k,q-l)).

a(n,q) = Sum_{k=1..n-2}binomial(n,k)*(A(n-k, q - k(k-1)/2 - k(n-k)) - a(n-k, q - k(k-1)/2 - k(n-k)));

   */

  @Override
  public Z next() {
    System.out.println("A");
    for (int n = 2; n <= 6; ++n) {
      for (int k = 1; k <= n * (n - 1) / 2; ++k) {
        System.out.print(mBigA.get(n, k) + " ");
      }
      System.out.println();
    }
    System.out.println("a");
    for (int n = 2; n <= 6; ++n) {
      for (int k = 1; k <= n * (n - 1) / 2; ++k) {
        System.out.print(mLittleA.get(n, k) + " ");
      }
      System.out.println();
    }
    return null;

//    if (++mM > mN * (mN - 1) / 2) {
//      ++mN;
//      mM = 1;
//    }
//    return mLittleA.get(mN, mM);
  }
}

