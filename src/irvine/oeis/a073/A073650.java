package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073650 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).subtract(p).equals(Z.SIX) && p.subtract(mPrime.prevPrime(p)).equals(Z.TWO)) {
        return p;
      }
    }
  }
}
