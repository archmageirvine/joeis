package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062772 Smallest prime larger than square of n-th prime.
 * @author Sean A. Irvine
 */
public class A062772 extends A000040 {

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().square());
  }
}
