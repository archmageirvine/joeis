package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027356 Array read by rows: <code>T(n,k) =</code> number of partitions of n into distinct odd parts in which k is the greatest part, for <code>k=1,2,...,n, n&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A027356 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if ((n & 1) == 1 && m.equals(n)) {
      return Z.ONE;
    }
    if (m == 1 || n < 3 || m.equals(n) || m > n) {
      return Z.ZERO;
    }
    if ((m & 1) == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k < n; ++k) {
      sum = sum.add(get(n - m, k));
    }
    return sum;
  }

  /*
  // todo this looks wrong for T(6,3)
  T(n, 1)=0 for all n; T(n, n)=1 for all odd n>1; and for n>=3, T(n, k)=0 if k is even, else T(n, k)=Sum{T(n-k, i): i=1, 2, ..., n-1} for k=2, 3, ..., n-1.
   */

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
