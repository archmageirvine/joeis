package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017424 (11n+2)^12.
 * @author Sean A. Irvine
 */
public class A017424 extends Sequence0 {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

