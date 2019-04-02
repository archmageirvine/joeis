package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001715 a(n) = n!/6.
 * @author Sean A. Irvine
 */
public class A001715 implements Sequence {

  private long mN = 2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

}
