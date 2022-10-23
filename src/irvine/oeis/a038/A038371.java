package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038371 Smallest prime factor of 10^n+1.
 * @author Sean A. Irvine
 */
public class A038371 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    return Jaguar.factor(mT.add(1)).leastPrimeFactor();
  }
}
