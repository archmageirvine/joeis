package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025036 Number of partitions of <code>{ 1, 2</code>, ..., <code>4n }</code> into sets of size 4.
 * @author Sean A. Irvine
 */
public class A025036 implements Sequence {

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

