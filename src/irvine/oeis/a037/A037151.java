package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A037151 Smallest prime &gt; n!.
 * @author Sean A. Irvine
 */
public class A037151 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
