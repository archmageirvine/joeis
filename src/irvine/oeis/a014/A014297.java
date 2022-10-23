package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014297 a(n) = n! * C(n+2, 2) * 2^(n+1).
 * @author Sean A. Irvine
 */
public class A014297 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Binomial.binomial(mN + 2, 2)).shiftLeft(mN + 1);
  }
}

