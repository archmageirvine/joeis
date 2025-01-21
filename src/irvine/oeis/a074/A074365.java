package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A074365 Smallest prime &gt; the concatenation of the first n natural numbers.
 * @author Sean A. Irvine
 */
public class A074365 extends A007908 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
