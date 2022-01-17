package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A053785 Nextprime(n^4) - n^4.
 * @author Sean A. Irvine
 */
public class A053785 extends A000583 {

  private final Fast mPrime = new Fast();
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n4 = super.next();
    return mPrime.nextPrime(n4).subtract(n4);
  }
}
