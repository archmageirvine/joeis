package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025040 Number of partitions of <code>{ 1, 2</code>, ..., <code>8n }</code> into sets of size 8.
 * @author Sean A. Irvine
 */
public class A025040 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(8 * mN - 7).multiply(4 * mN - 3).multiply(8 * mN - 5).multiply(2 * mN - 1)
        .multiply(8 * mN - 3).multiply(4 * mN - 1).multiply(8 * mN - 1).divide(315);
    }
    return mA;
  }
}

