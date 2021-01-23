package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003955 a(n) = (2*n + 4) * (1*3*5*...*(2*n+1))^2.
 * @author Sean A. Irvine
 */
public class A003955 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.valueOf(2 * mN + 1).square());
    }
    return mA.multiply(2 * mN + 4);
  }
}
