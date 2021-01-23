package irvine.oeis.a046;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046937 Same rule as Aitken triangle (A011971) except a(0,0)=1, a(1,0)=2.
 * @author Sean A. Irvine
 */
public class A046937 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.TWO;
      }
      return get(n - 1, n - 1);
    }
    return get(n, m - 1).add(get(n - 1, m - 1));
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
