package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002386;

/**
 * A073861 Smaller of pair of successive n-digit primes with maximal difference.
 * @author Sean A. Irvine
 */
public class A073861 extends A002386 {

  private Z mM = Z.ONE;

  @Override
  public Z next() {
    mM = mM.multiply(10);
    Z best = null;
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).compareTo(mM) > 0) {
        break;
      }
      best = p;
    }
    if (best == null) {
      throw new RuntimeException();
    }
    return best;
  }
}
