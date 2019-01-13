package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003031.
 * @author Sean A. Irvine
 */
public class A003031 implements Sequence {

  private long mN = -1;
  private Z mF = Z.TWO;


  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(2 * mN).multiply(2 * mN + 1).shiftLeft(2);
    }
    return mF.multiply(4 * mN + 3);
  }
}
