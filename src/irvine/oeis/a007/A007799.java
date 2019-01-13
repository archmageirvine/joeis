package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007799.
 * @author Sean A. Irvine
 */
public class A007799 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 0) {
      return Z.ZERO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    if (m == 1) {
      return Z.valueOf(n - 1);
    }
    if (m == 2) {
      return Z.valueOf(n - 1).multiply(n - 2);
    }
    return get(n - 1, m)
      .add(get(n - 1, m - 1).multiply(n - 1))
      .subtract(get(n - 2, m - 1).multiply(n - 2))
      .add(get(n - 2, m - 3).multiply(n - 2));
  }

  @Override
  public Z next() {
    if (++mM > 3 * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
