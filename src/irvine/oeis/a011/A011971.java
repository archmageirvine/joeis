package irvine.oeis.a011;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011971 Aitken's array: triangle of numbers {a(n,k), n &gt;= 0, 0&lt;=k&lt;=n} read by rows, defined by a(0,0)=1, a(n,0)=a(n-1,n-1), a(n,k)=a(n,k-1)+a(n-1,k-1).
 * @author Sean A. Irvine
 */
public class A011971 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, n - 1);
    }
    return get(n, m - 1).add(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
