package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005012 Shifts one place left under 6th-order binomial transform.
 * @author Sean A. Irvine
 */
public class A005012 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z mA = Z.ZERO;
    Z mF = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      mA = mA.add(mF.multiply(Functions.STIRLING2.z(mN, mN - k)));
      mF = mF.multiply(6);
    }
    return mA;
  }

}

