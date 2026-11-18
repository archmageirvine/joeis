package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A087458 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ONE;
    }
    return mPrime.prevPrime(mPrime.nextPrime(p).subtract(p).add(1));
  }
}
