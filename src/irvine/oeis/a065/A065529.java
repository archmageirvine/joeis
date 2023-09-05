package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065529 "Inverted" decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065529 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    final CR scaledPi = CR.PI.multiply(mT);
    return scaledPi.subtract(CR.valueOf(scaledPi.floor())).inverse().floor();
  }
}

