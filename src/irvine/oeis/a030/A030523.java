package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030523 A convolution triangle of numbers obtained from A001792.
 * @author Sean A. Irvine
 */
public class A030523 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    if (m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m).multiply(4).subtract(get(n - 2, m).multiply(4)).add(get(n - 1, m - 1)).subtract(get(n - 2, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
