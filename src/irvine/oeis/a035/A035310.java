package irvine.oeis.a035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a001.A001055;

/**
 * A035310 Let f(n) = number of ways to factor n = A001055(n); a(n) = sum of f(k) over all terms k in A025487 that have n factors.
 * @author Sean A. Irvine
 */
public class A035310 extends A001055 {

  // After Alois P. Heinz

  private int mN = 0;

  private Z b(final int n, final int m, final List<Integer> l) {
    if (n == 0) {
      Z prod = Z.ONE;
      Z p = Z.TWO;
      for (final int t : l) {
        prod = prod.multiply(p.pow(t));
        p = mPrime.nextPrime(p);
      }
      final long prl = prod.longValueExact();
      return Z.valueOf(t(prl, prl));
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final List<Integer> lst = new ArrayList<>(l);
    for (int j = 0; j <= n / m; ++j) {
      sum = sum.add(b(n - m * j, m - 1, lst));
      lst.add(m);
    }
    return sum;
  }

  @Override
  public Z next() {
    return b(++mN, mN, Collections.emptyList());
  }
}
