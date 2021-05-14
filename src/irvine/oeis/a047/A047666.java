package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047666 Square array a(n,k) read by antidiagonals: a(n,1)=n, a(1,k)=k, a(n,k) = a(n-1,k-1) + a(n-1,k) + a(n,k-1).
 * @author Sean A. Irvine
 */
public class A047666 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 1) {
      return Z.valueOf(k);
    }
    if (k == 1) {
      return Z.valueOf(n);
    }
    return get(n - 1, k - 1).add(get(n, k - 1)).add(get(n - 1, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN - mM + 1, mM);
  }
}
