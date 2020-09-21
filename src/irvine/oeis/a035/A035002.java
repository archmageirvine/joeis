package irvine.oeis.a035;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035002 Square array a(m,n) read by antidiagonals, where a(m,n) = sum(a(m-k,n), k=1..m-1) + sum(a(m,n-k), k=1..n-1).
 * @author Sean A. Irvine
 */
public class A035002 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer m, final Integer n) {
    if (m == 1) {
      return n == 1 ? Z.ONE : Z.ONE.shiftLeft(n - 2);
    }
    if (n == 1) {
      return Z.ONE.shiftLeft(m - 2);
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < m; ++k) {
      sum = sum.add(get(m - k, n));
    }
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(m, n - k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN - mM + 1, mM);
  }
}
