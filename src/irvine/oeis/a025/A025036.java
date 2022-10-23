package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025036 Number of partitions of { 1, 2, ..., 4n } into sets of size 4.
 * @author Sean A. Irvine
 */
public class A025036 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(4 * mN - 3).multiply(4 * mN - 1).multiply(2 * mN - 1).divide(3);
    }
    return mA;
  }
}

