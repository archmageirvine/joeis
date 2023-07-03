package irvine.oeis.a048;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A048113 Triangular array T read by rows: T(h,k) = number of paths consisting of steps from (1,1) to (h,k) such that each step has length 1 directed up or right and each vertex (i,j) satisfies i/2&lt;=j&lt;=2i, for h=0,1,2,... and k=0,1,2,...
 * @author Sean A. Irvine
 */
public class A048113 extends MemoryFunction2Sequence<Long, Z> {

  // After Jean-Fran&ccedil;ois Alcover

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 0 || (n == 1 && m == 0)) {
      return Z.ZERO;
    }
    if (2 * m < n || m > 2 * n) {
      return Z.ZERO;
    }
    if (n == 1 || (n == 2 && m == 1)) {
      return Z.ONE;
    }
    Z res = Z.ZERO;
    if (2 * (n - 1) >= m) {
      res = res.add(get(n - 1, m));
    }
    if (2 * (m - 1) >= n) {
      res = res.add(get(n, m - 1));
    }
    return res;
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
