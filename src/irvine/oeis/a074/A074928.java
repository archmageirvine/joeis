package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074928 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = p.multiply(mPrime.nextPrime(p));
    return mPrime.nextPrime(q).subtract(q);
  }
}
