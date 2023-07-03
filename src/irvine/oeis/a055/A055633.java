package irvine.oeis.a055;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A055633 Number of nested algorithms a(m,n) where m is the number of items in a contaminated group and n is the total number of unclassified items (0 &lt;= m &lt;= n) (values read by antidiagonals).
 * @author Sean A. Irvine
 */
public class A055633 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    //System.out.println("n=" +n + " m=" + m);
    if (n == 0) {
      if (m <= 1) {
        return Z.ONE;
      }
      Z prod = Binomial.catalan(m);
      for (int k = 1; k < m; ++k) {
        prod = prod.multiply(get(0, k));
      }
      return prod;
    }
    if (m < n) {
      return Z.ZERO;
    }
    Z prod = Binomial.catalan(n - 1);
    for (int k = 1; k <= n; ++k) {
      prod = prod.multiply(get(0, m - k));
    }
    return prod;
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN / 2;
    }
    return get(mM, mN - mM);
  }
}
