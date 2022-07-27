package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058127 Triangle read by rows: T(j,k) is the number of acyclic functions from {1,...,j} to {1,...,k}. For n &gt;= 1, a(n) = (k-j)*k^(j-1), where k is such that C(k,2) &lt; n &lt;= C(k+1,2) and j = (n-1) mod C(k,2). Alternatively, table T(k,j) read by antidiagonals with k &gt;= 1, 0 &lt;= j &lt;= k: T(k,j) = number of acyclic-function digraphs on k vertices with j vertices of outdegree 1 and (k-j) vertices of outdegree 0; T(k,j) = (k-j)*k^(j-1).
 * @author Sean A. Irvine
 */
public class A058127 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 1) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (m >= n) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, m, k -> get(n - 1, k).multiply(Binomial.binomial(m, k)));
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
