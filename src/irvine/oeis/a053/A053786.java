package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A053786 a(n) = next prime after n^4.
 * @author Sean A. Irvine
 */
public class A053786 extends A000583 {

  private final Fast mPrime = new Fast();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
