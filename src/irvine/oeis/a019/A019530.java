package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019530 Smallest number m such that m^m is divisible by n.
 * @author Sean A. Irvine
 */
public class A019530 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = Z.ZERO;
    while (!m.modPow(m, mN).isZero()) {
      m = m.add(1);
    }
    return m;
  }
}

