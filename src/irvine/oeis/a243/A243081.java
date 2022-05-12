package irvine.oeis.a243;

import irvine.math.MemoryFunctionInt4;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A243081 Number A(n,k) of compositions of n into parts with multiplicity not larger than k; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A243081 extends UpperLeftTriangle {

  /* Maple:
    b:= proc(n, i, p, k) option remember; `if`(n=0, p!, `if`(i<1, 0,
          add(b(n-i*j, i-1, p+j, k)/j!, j=0..min(n/i, k))))
        end:
    A:= (n, k)-> `if`(k>=n, `if`(n=0, 1, 2^(n-1)), b(n$2, 0, k)):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt4<Q> mB = new MemoryFunctionInt4<Q>() {
    @Override
    protected Q compute(final int n, final int i, final int p, final int k) {
      if (n == 0) {
        return new Q(MemoryFactorial.SINGLETON.factorial(p));
      }
      if (i < 1) {
        return Q.ZERO;
      }
      Q sum = Q.ZERO;
      final int ni = n / i;
      final int jmax = k < ni ? k : ni;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, p + j, k).divide(MemoryFactorial.SINGLETON.factorial(j)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    if (k >= n) {
      return n == 0 ? Z.ONE : Z.ONE.shiftLeft(n - 1);
    }
    return mB.get(n, n, 0, k).num();
  }
}
