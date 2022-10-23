package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025037 Number of partitions of { 1, 2, ..., 5n } into sets of size 5.
 * @author Sean A. Irvine
 */
public class A025037 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(5 * mN - 4).multiply(5 * mN - 3).multiply(5 * mN - 2).multiply(5 * mN - 1).divide(24);
    }
    return mA;
  }
}

