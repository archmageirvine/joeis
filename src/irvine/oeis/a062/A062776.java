package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062776 Greatest common divisor of (n+2)! and n^n.
 * @author Sean A. Irvine
 */
public class A062776 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 2);
    return mF.gcd(Z.valueOf(mN).pow(mN));
  }
}
