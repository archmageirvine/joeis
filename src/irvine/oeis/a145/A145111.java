package irvine.oeis.a145;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A145111 Square array A(n,k) of numbers of length n binary words with fewer than k 0-digits between any pair of consecutive 1-digits (n,k &gt;= 0), read by antidiagonals.
 * @author Georg Fischer
 */
public class A145111 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A145111() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    f:= proc(n,k) option remember; local j; if n=0 then 1 elif n<=k then 2^(n-1) else add(f(n-j, k), j=1..k) fi end:
    g:= proc(n,k) option remember; if n<0 then 0 else g(n-1,k) +f(n,k) fi end:
    A:= (n,k)-> `if`(n=0, g(0,k), A(n-1,k) +g(n-1,k)): seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunction2<Integer, Z> mF = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n <= k) {
        return Z.ONE.shiftLeft(n - 1);
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        sum = sum.add(get(n - j, k));
      }
      return sum;
    }
  };

  private final MemoryFunction2<Integer, Z> mG = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n < 0) {
        return Z.ZERO;
      }
      return get(n - 1, k).add(mF.get(n, k));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return n == 0 ? mG.get(0, k) : matrixElement(n - 1, k).add(mG.get(n - 1, k));
  }
}
