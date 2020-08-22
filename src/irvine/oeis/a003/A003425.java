package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A003425 n! times number of posets with n elements.
 * @author Sean A. Irvine
 */
public class A003425 extends A001035 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
