package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052325 Number of asymmetric rooted trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A052325 extends MemorySequence {

  // After Alois P. Heinz

  {
    setOffset(1);
    add(Z.ONE);
  }

  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= n / m; ++j) {
        final Z t = Binomial.binomial(A052325.this.get(m).subtract(m == 3 ? 1 : 0), Z.valueOf(j)).multiply(get(n - m * j, m - 1));
        sum = sum.add(t);
      }
      return sum;
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    return mB.get(n - 1, n - 1);
  }
}
/*
b:= proc(n, i) option remember;

      `if`(n=0, 1, `if`(i<1, 0, add(binomial(a(i)-

      `if`(i=3, 1, 0), j)*b(n-i*j, i-1), j=0..n/i)))

    end:

a:= n-> `if`(n<1, 1, b(n-1, n-1)):

seq(a(n), n=1..50);  # Alois P. Heinz, Jul 06 2014
 */
