package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025038 Number of partitions of <code>{ 1, 2</code>, ..., <code>6n }</code> into sets of size 6.
 * @author Sean A. Irvine
 */
public class A025038 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(6 * mN - 5).multiply(3 * mN - 2).multiply(2 * mN - 1).multiply(3 * mN - 1).multiply(6 * mN - 1).divide(10);
    }
    return mA;
  }
}

