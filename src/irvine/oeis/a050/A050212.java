package irvine.oeis.a050;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050212.
 * @author Sean A. Irvine
 */
public class A050212 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 3;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 4 || m < 1) {
      return Z.ZERO;
    }
    if (n == 4 && m == 1) {
      return Z.SIX;
    }
    return get(n - 1, m).multiply(n - 1).add(get(n - 4, m - 1).multiply(n - 1).multiply(n - 2).multiply(n - 3));
  }

  @Override
  public Z next() {
    if (++mM > mN / 4) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
