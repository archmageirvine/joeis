package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A035345 Smallest prime &gt; prime(1)*prime(2)*...*prime(n)+1.
 * @author Sean A. Irvine
 */
public class A035345 extends A002110 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().add(1));
  }
}

