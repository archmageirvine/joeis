package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026268 Irregular triangular array T read by rows: <code>T(i,0)=1</code> for i <code>&gt;= 0, T[1,1] = 1, T(1,2) = 1, T(2,1) = 1, T(2,2) = 1, T(3,1) = 2, T(3,2) = 2, T(3,3) = 2</code>; and for i <code>&gt;= 4, T(i,1) = i-1, T(i,i) = T(i-1,i-2) + T(i-1,i-1)</code> and <code>T(i,j) = T(i-1,j-2) + T(i-1,j-1 )+ T(i-1,j)</code> for <code>j=2..i-1</code>.
 * @author Sean A. Irvine
 */
public class A026268 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || n <= 2) {
      return Z.ONE;
    }
    if (n == 3) {
      return Z.TWO;
    }
    if (m == 1) {
      return Z.valueOf(n - 1);
    }
    if (m.equals(n)) {
      return get(n - 1, n - 2).add(get(n - 1, n - 1));
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
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
