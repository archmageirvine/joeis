package irvine.oeis.a259;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259708.
 * @author Sean A. Irvine
 */
public class A259708 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n < 0 || k < 0) {
      return Z.ZERO;
    } else if (n == 0 && k == 0) {
      return Z.ONE;
    } else {
      return get(n - 1, k - 1).multiply(n - k + 1)
        .add(get(n - 1, k).multiply(k))
        .add(get(n - 2, k))
        .subtract(get(n - 2, k - 1).multiply2())
        .add(get(n - 2, k - 2));
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
