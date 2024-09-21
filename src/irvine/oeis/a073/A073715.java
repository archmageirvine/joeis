package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A073715 Prime preceding the n-th Mersenne prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A073715 extends A000668 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next());
  }
}
