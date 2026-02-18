package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392116 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392116 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).divide(5).subtract(p.divide(5));
  }
}
