package irvine.oeis.a011;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011794 Triangle defined by <code>a(n+1</code>,k)=a(n,k-1)+a(n-1,k), <code>a(n,1)=1, a(1</code>,k)=1, <code>a(2</code>,k)=min(2,k).
 * @author Sean A. Irvine
 */
public class A011794 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 1 || k <= 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.TWO.min(Z.valueOf(k));
    }
    return get(n - 1, k - 1).add(get(n - 2, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
