package irvine.oeis.a111;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A111999 T(n, k) = [x^k] (-1)^n*Sum_{k=0..n} E2(n, n-k)*(1+x)^(n-k) where E2(n, k) are the second-order Eulerian numbers. Triangle read by rows, T(n, k) for n &gt;= 1 and 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A111999 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n < k + 1) {
      return Z.ZERO;
    }
    if (n == 1 && k == 0) {
      return Z.NEG_ONE;
    }
    if (k == -1) {
      return Z.ZERO;
    }
    return get(n - 1, k).add(get(n - 1, k - 1)).multiply(k + 1 - 2 * n);
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
