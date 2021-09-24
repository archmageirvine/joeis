package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051696 Greatest common divisor of n! and n^n.
 * @author Sean A. Irvine
 */
public class A051696 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.gcd(Z.valueOf(mN).pow(mN));
  }
}
