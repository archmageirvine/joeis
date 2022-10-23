package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008336 a(n+1) = a(n)/n if n|a(n) else a(n)*n, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A008336 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mA.mod(mN) == 0) {
        mA = mA.divide(mN);
      } else {
        mA = mA.multiply(mN);
      }
    }
    return mA;
  }
}


