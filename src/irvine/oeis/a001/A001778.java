package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001778 Lah numbers: a(n) = n!*binomial(n-1,5)/6!.
 * @author Sean A. Irvine
 */
public class A001778 implements Sequence {

  private long mN = 5;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 6) {
      mA = mA.multiply(mN).multiply(mN - 1).divide(mN - 6);
    }
    return mA;
  }
}
