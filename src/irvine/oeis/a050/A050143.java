package irvine.oeis.a050;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050143 A(n,k) = Sum_{h=0..n-1, m=0..k} A(h,m) for n &gt;= 1 and k &gt;= 1, with A(n,0) = 1 for n &gt;= 0 and A(0,k) = 0 for k &gt;= 1; square array A, read by descending antidiagonals.
 * @author Sean A. Irvine
 */
public class A050143 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 0) {
      return Z.ZERO;
    }
    if (m == 1) {
      return Z.ONE.shiftLeft(n).subtract(1);
    }
    return get(n - 1, m).multiply2().add(get(n, m - 1)).subtract(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
