package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025042 Number of partitions of { 1, 2, ..., 10n } into sets of size 10.
 * @author Sean A. Irvine
 */
public class A025042 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(10 * mN - 9).multiply(5 * mN - 4).multiply(10 * mN - 7)
        .multiply(5 * mN - 3).multiply(2 * mN - 1).multiply(5 * mN - 2)
        .multiply(10 * mN - 3).multiply(5 * mN - 1).multiply(10 * mN - 1).divide(4536);
    }
    return mA;
  }
}

