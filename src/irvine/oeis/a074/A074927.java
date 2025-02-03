package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074927 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.TWO.equals(p) ? Z.THREE : mPrime.nextPrime(p).subtract(p).divide2().square();
  }
}
