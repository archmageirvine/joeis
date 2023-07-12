package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A027144 Triangular array T given by rows: T(n,0)=1 for n &gt;= 0, T(1,1)=2; for even n &gt;= 2, T(n,k)=T(n-2,k-1)+T(n-1,k-1)+T(n-1,k) for 1&lt;=(odd k)&lt;=n-1 and T(n,k)=T(n-1,k-1)+T(n-1,k) for 2&lt;=(even k)&lt;=n-2, T(n,n)=T(n-1,n-1); for odd n&lt;=3, T(n,k)=T(n,k-1)+T(n-1,k-1)+T(n-1,k) for 1&lt;=(odd k)&lt;=n-2 and T(n,k)=T(n-1,k-1)+T(n-1,k) for 2&lt;=(even k)&lt;=n-1, T(n,n)=T(n-1,n-1)+T(n,n-1).
 * @author Sean A. Irvine
 */
public class A027144 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A027144() {
    super(1);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (m == 1 && n == 1) {
      return Z.TWO;
    }
    if (n <= 1) {
      return Z.ZERO;
    }
    if ((n & 1) == 0) {
      if (n.equals(m)) {
        return get(n - 1, m - 1);
      }
      if ((m & 1) == 0) {
        return get(n - 1, m - 1).add(get(n - 1, m));
      } else {
        return get(n - 2, m - 1).add(get(n - 1, m - 1)).add(get(n - 1, m));
      }
    } else {
      // odd n
      if (n.equals(m)) {
        return get(n - 1, m - 1).add(get(n, n - 1));
      }
      if ((m & 1) == 0) {
        return get(n - 1, m - 1).add(get(n - 1, m));
      } else {
        return get(n, m - 1).add(get(n - 1, m - 1)).add(get(n - 1, m));
      }
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
