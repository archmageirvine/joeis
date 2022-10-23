package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025035 Number of partitions of { 1, 2, ..., 3n } into sets of size 3.
 * @author Sean A. Irvine
 */
public class A025035 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3 * mN - 2).multiply(3 * mN - 1).divide2();
    }
    return mA;
  }
}

