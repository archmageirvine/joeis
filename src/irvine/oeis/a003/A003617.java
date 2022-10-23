package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003617 Smallest n-digit prime.
 * @author Sean A. Irvine
 */
public class A003617 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(mA);
    mA = mA.multiply(10);
    return p;
  }
}
