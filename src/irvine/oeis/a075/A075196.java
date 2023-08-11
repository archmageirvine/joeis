package irvine.oeis.a075;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A075196 Table T(n,k) by antidiagonals: T(n,k) = number of partitions of n balls of k colors.
 * @author Georg Fischer
 */
public class A075196 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A075196() {
    super(1, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    with(numtheory):
    A:= proc(n, k) option remember; local d, j;
          `if`(n=0, 1, add(add(d*binomial(d+k-1, k-1),
           d=divisors(j)) *A(n-j, k), j=1..n)/n)
        end:
    seq(seq(A(n, 1+d-n), n=1..d), d=1..12);  # _Alois P. Heinz_, Sep 26 2012
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Integers.SINGLETON.sumdiv(j, d -> Binomial.binomial(d + k - 1, k - 1).multiply(d))));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
