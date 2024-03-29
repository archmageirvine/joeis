package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059788 a(n) = largest prime &lt; 2*prime(n).
 * @author Sean A. Irvine
 */
public class A059788 extends A000040 {

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next().multiply2());
  }
}
