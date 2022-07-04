package irvine.oeis.a319;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A319539 Array read by antidiagonals: T(n,k) is the number of binary rooted trees with n leaves of k colors and all non-leaf nodes having out-degree 2.
 * @author Georg Fischer
 */
public class A319539 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A319539() {
    super(1, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n<2, k*n, `if`(n::odd, 0,
          (t-> t*(1-t)/2)(A(n/2, k)))+add(A(i, k)*A(n-i, k), i=1..n/2))
        end:
    seq(seq(A(n, 1+d-n), n=1..d), d=1..12);  # _Alois P. Heinz_, Sep 23 2018
  */
  protected static final MemoryFunctionInt2<Z> A = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n < 2) {
        return Z.valueOf((long) k * n);
      }
      Z sum = Z.ZERO;
      if ((n & 1) != 1) { // not odd
        final Z t = get(n / 2, k);
        sum = t.multiply(Z.ONE.subtract(t)).divide2();
      }
      final int imax = n / 2;
      for (int i = 1; i <= imax; ++i) {
        sum = sum.add(get(i, k).multiply(get(n - i, k)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return A.get(n, k);
  }
}
