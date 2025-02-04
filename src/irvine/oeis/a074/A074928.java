package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074928 a(n)&gt;0 such that p(n)*p(n+1)+a(n) is a minimal prime.
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
