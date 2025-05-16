package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077338 a(n) = smallest multiple of prime(n) such that a(n) +1 is a multiple of prime(n+1).
 * @author Sean A. Irvine
 */
public class A077338 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    Z r = p.add(1);
    while (!r.mod(q).isZero()) {
      r = r.add(p);
    }
    return r.subtract(1);
  }
}
