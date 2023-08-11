package irvine.oeis.a295;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A295028 A(n,k) is (1/n) times the n-th derivative of the k-th tetration of x (power tower of order k) x^^k at x=1; square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A295028 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A295028() {
    super(1, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k) option remember; `if`(n=0, 1, `if`(k=0, 0,
          -add(binomial(n-1, j)*b(j, k)*add(binomial(n-j, i)*
          (-1)^i*b(n-j-i, k-1)*(i-1)!, i=1..n-j), j=0..n-1)))
        end:
    A:= (n, k)-> b(n, min(k, n))/n:
    seq(seq(A(n, 1+d-n), n=1..d), d=1..14);
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k == 0) {
        return Z.ZERO;
      }
      Z sumj = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        Z sumi = Z.ZERO;
        final int imax = n - j;
        for (int i = 1; i <= imax; ++i) {
          sumi = sumi.add(Binomial.binomial(n - j, i)
            .multiply(((i & 1) == 0) ? 1 : -1)
            .multiply(get(n - j - i, k - 1))
            .multiply(MemoryFactorial.SINGLETON.factorial(i - 1)));
        }
        sumj = sumj.add(Binomial.binomial(n - 1, j)
          .multiply(get(j, k))
          .multiply(sumi));
      }
      return sumj.negate();
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, Math.min(k, n)).divide(n);
  }
}
