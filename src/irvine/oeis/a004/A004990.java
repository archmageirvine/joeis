package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004990.
 * @author Sean A. Irvine
 */
public class A004990 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN - 4).multiply(3).divide(mN);
    }
    return mA;
  }
}

