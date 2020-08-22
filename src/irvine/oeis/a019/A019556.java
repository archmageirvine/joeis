package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019556 Dimension of space of Jacobi forms of weight 4 and index n.
 * @author Sean A. Irvine
 */
public class A019556 implements Sequence {

  private long mN = -1;

  private long dimM(final long i) {
    switch ((int) (i % 12)) {
      case 2:
        return i / 12;
      case 0:
      case 4:
      case 6:
      case 8:
      case 10:
        return i / 12 + 1;
      default:
        throw new UnsupportedOperationException();
    }
  }

  @Override
  public Z next() {
    Z sum = Z.ONE;
    ++mN;
    for (long v = 1; v <= mN; ++v) {
      sum = sum.add(dimM(4 + 2 * v)).subtract((v * v + 4 * mN - 1) / (4 * mN));
    }
    return sum;
  }
}
