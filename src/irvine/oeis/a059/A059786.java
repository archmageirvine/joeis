package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059786 Smallest prime after 2*(n-th prime).
 * @author Sean A. Irvine
 */
public class A059786 extends A000040 {

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().multiply2());
  }
}
