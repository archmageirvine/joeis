package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025039 Number of partitions of <code>{ 1, 2</code>, ..., <code>7n }</code> into sets of size 7.
 * @author Sean A. Irvine
 */
public class A025039 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(7 * mN - 6).multiply(7 * mN - 5).multiply(7 * mN - 4)
        .multiply(7 * mN - 3).multiply(7 * mN - 2).multiply(7 * mN - 1).divide(720);
    }
    return mA;
  }
}

