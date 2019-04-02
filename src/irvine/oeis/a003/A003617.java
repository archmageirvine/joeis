package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003617 Smallest n-digit prime.
 * @author Sean A. Irvine
 */
public class A003617 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(mA);
    mA = mA.multiply(10);
    return p;
  }
}
