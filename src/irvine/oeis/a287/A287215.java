package irvine.oeis.a287;
// manually 2026-08-16/mtabfun

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A287215 Number T(n,k) of set partitions of [n] such that the maximal absolute difference between the least elements of consecutive blocks equals k;
 * triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=max(n-1,0), read by rows.
 * @author Georg Fischer
 */
public class A287215 extends LambdaTable {

  private boolean mFirst;

  /** Construct the sequence. */
  public A287215() {
    super(0, 0, n -> new Integer[] {0, n}, (n, k) -> Z.ZERO);
    mFirst = true;
  }

  /* Maple:
     b:= proc(n, k, m, l) option remember; `if`(n<1, 1,
          `if`(l-n>k, 0, b(n-1, k, m+1, n))+m*b(n-1, k, m, l))
         end:
     A:= (n, k)-> b(n-1, min(k, n-1), 1, n):
     T:= (n, k)-> A(n, k)-`if`(k=0, 0, A(n, k-1)):
     seq(seq(T(n, k), k=0..max(n-1, 0)), n=0..12);  
  */
  final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int k, final int m, final int l) {
      return
        n < 1 ? Z.ONE : (l - n > k ? Z.ZERO : get(n - 1, k, m + 1, n)).add(get(n - 1, k, m, l).multiply(m));
    }
  };

  final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      return mB.get(n - 1, Functions.MIN.i(k, n - 1), 1, n);
    }
  };

  @Override
  public Z a(final long n, final long k) {
    if (mFirst) {
      mFirst = false;
      mColRange = cn -> new Integer[] {0, Functions.MAX.i(cn - 1, 0)};
      mLambda = (cn, ck) -> mA.get(cn, ck).subtract(ck == 0 ? Z.ZERO : mA.get(cn, ck - 1));
    }
    final Integer[] range = mColRange.apply((int) n);
    if (k < range[0] || k > range[1]) {
      return Z.ZERO;
    }
    return mLambda.apply((int) n, (int) k);
  }

  /**
   * Return next term, reading the triangle row by row from left to right,
   * starting with T[mRowMin, mColMin].
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mColRange = cn -> new Integer[] {0, Functions.MAX.i(cn - 1, 0)};
      mLambda = (cn, ck) -> mA.get(cn, ck).subtract(ck == 0 ? Z.ZERO : mA.get(cn, ck - 1));
    }
    return super.next();
  }

}
