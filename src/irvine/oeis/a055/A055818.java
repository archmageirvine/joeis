package irvine.oeis.a055;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055818 Triangle T read by rows: T(i,j) = R(i-j,j), where R(i,0) = R(0,i) = 1 for i &gt;= 0, R(i,j) = Sum_{h=0..i-1} Sum_{m=0..j} R(h,m) for i &gt;= 1, j &gt;= 1.
 * @author Sean A. Irvine
 */
public class A055818 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0 || m == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      for (int j = 0; j <= m; ++j) {
        sum = sum.add(get(k, j));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}
