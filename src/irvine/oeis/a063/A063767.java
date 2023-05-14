package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000420;

/**
 * A063767 Smallest prime &gt; 7^n.
 * @author Sean A. Irvine
 */
public class A063767 extends A000420 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
