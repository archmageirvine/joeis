package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032317 Shifts left under "EGJ" (unordered, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032317 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

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
      final int[] t = new int[j + 1];
      Arrays.fill(t, m);
      t[0] = n - m * j;
      sum = sum.add(Binomial.multinomial(n, t).multiply(Binomial.binomial(get(m - 1, m - 1), Z.valueOf(j))).multiply(get(n - m * j, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
/*
b:= proc(n, i) option remember; `if`(n=0, 1, `if`(i<1, 0,

      add(multinomial(n, i$j, n-i*j)*binomial(b((i-1)$2), j)

       *b(n-i*j, i-1), j=0..n/i)))

    end:

a:= n-> b((n-1)$2):

seq(a(n), n=1..30);
 */
