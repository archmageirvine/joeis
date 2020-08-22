package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026703 Triangular array T read by rows: T(n,1) = T(n,n) = 1, T(n,k) = T(n-1, k-1) + T(n-2,k-1) + T(n-1,k) if k=(n/2) or k=((n+1)/2), otherwise T(n,k) = T(n-1,k-1) + T(n-1,k).
 * @author Sean A. Irvine
 */
public class A026703 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if (m == n / 2 || m == (n + 1) / 2) {
      return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 2, m - 1));
    } else {
      return get(n - 1, m - 1).add(get(n - 1, m));
    }
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
