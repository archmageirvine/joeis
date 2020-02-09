package irvine.oeis.a028;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028498 Let <code>[n] = {0,...,n-1}; a(n)</code> is number of functions <code>f:[n] -&gt; [n]</code> for which there exists an injection <code>g:[n] -&gt; [n+1]</code> such that for j with <code>0 &lt;= j &lt</code>; n, either <code>g(j) = f(j)</code> or <code>g(j) = f(j)+1</code>.
 * @author Sean A. Irvine
 */
public class A028498 extends MemoryFunction2<Long, Z> implements Sequence {

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
