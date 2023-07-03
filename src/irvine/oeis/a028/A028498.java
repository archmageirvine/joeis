package irvine.oeis.a028;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A028498 Let [n] = {0,...,n-1}; a(n) is number of functions f:[n] -&gt; [n] for which there exists an injection g:[n] -&gt; [n+1] such that for j with 0 &lt;= j &lt; n, either g(j) = f(j) or g(j) = f(j)+1.
 * @author Sean A. Irvine
 */
public class A028498 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;

  @Override
  protected Z compute(final Long m, final Long n) {
    if (m < 1 || n < 1 || m > n + 1) {
      return Z.ZERO;
    }
    if (m == 1) {
      return Z.valueOf(n);
    }
    if (m == 2) {
      return Z.valueOf(n).square();
    }
    return get(m, n - 1)
      .add(get(m - 1, n - 1).multiply(2 * m))
      .subtract(get(m - 1, n - 2).multiply(m))
      .subtract(get(m - 2, n - 2).multiply(Binomial.binomial(m, 2)));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
