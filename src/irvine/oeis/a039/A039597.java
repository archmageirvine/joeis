package irvine.oeis.a039;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039597 Triangle read by rows: T(n,k) = number of 2 X inf arrays [ n, n1, n2, ...; k, k1, k2,... ] with n&gt;=n1&gt;n2&gt;...&gt;=0, k&gt;=k1&gt;k2...&gt;=0, n&gt;k, n1&gt;k1, ...; n &gt;= 1, k &gt;= 0. Note that once ni or ki = 0, the strict inequalities become equalities (constant 0 thereafter).
 * @author Sean A. Irvine
 */
public class A039597 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.ONE.shiftLeft(n);
    }
    if (m == n - 1) {
      return Binomial.binomial(2L * mN, mN);
    }
    return get(n, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
