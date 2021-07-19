package irvine.oeis.a049;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049089 Array read by antidiagonals: T(1,j)=2j+2 i&gt;=1, T(i,1)=2i+2 i&gt;=1, T(i,j)=T(i-1,j-1)+T(i-1,j).
 * @author Sean A. Irvine
 */
public class A049089 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1) {
      return Z.valueOf(2 * m + 2);
    }
    if (m == 1) {
      return Z.valueOf(2 * n + 2);
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 1;
      ++mN;
    }
    return get(mN - mM + 1, mM);
  }
}
