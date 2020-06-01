package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026568 Irregular triangular array T read by rows: <code>T(i,0) = T(i,2i) = 1</code> for i <code>&gt;= 0; T(i,1) = T(i,2i-1) = [ (i+1)/2 ]</code> for i <code>&gt;= 1;</code> and for i <code>&gt;= 2</code> and <code>2 &lt;=j &lt;= i - 2, T(i,j) = T(i-1,j-2) + T(i-1,j-1) + T(i-1,j)</code> if i + j is even, <code>T(i,j) = T(i-1,j-2) + T(i-1,j)</code> if i + j is odd.
 * @author Sean A. Irvine
 */
public class A026568 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    }
    if (m == 1 || m == 2 * n - 1) {
      return Z.valueOf((n + 1) / 2);
    }
    if (((n + m) & 1) == 0) {
      return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m));
    }
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
