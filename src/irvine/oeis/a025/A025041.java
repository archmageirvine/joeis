package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025041 Number of partitions of { 1, 2, ..., 9n } into sets of size 9.
 * @author Sean A. Irvine
 */
public class A025041 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(9 * mN - 8).multiply(9 * mN - 7)
        .multiply(3 * mN - 2).multiply(9 * mN - 5).multiply(9 * mN - 4)
        .multiply(3 * mN - 1).multiply(9 * mN - 2).multiply(9 * mN - 1).divide(4480);
    }
    return mA;
  }
}

