package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A014208.
 * @author Sean A. Irvine
 */
public class A014208 extends A000045 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
