package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047671 Square array a(n,k) read by antidiagonals: a(n,1)=1, a(1,k)=1, a(n,k) = 1 + a(n-1,k-1) + a(n-1,k) + a(n,k-1).
 * @author Sean A. Irvine
 */
public class A047671 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    return n == 1 || k == 1 ? Z.ONE : get(n - 1, k - 1).add(get(n, k - 1)).add(get(n - 1, k)).add(1);
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

