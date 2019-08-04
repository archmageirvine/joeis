package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025041 Number of partitions of <code>{ 1, 2</code>, ..., <code>9n }</code> into sets of size 9.
 * @author Sean A. Irvine
 */
public class A025041 implements Sequence {

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

