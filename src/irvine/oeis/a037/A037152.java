package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A037152 Smallest prime &gt; n!+1.
 * @author Sean A. Irvine
 */
public class A037152 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().add(1));
  }
}
