package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058017 a(n) is the smallest prime &gt; LCM(1,...,x), where x is the n-th prime power (A000961).
 * @author Sean A. Irvine
 */
public class A058017 extends A051451 {

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
