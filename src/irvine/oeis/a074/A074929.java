package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074929 a(n)&gt;0 such that p(n)*p(n+1)-a(n) is a maximal square.
 * @author Sean A. Irvine
 */
public class A074929 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = p.multiply(mPrime.nextPrime(p));
    return q.subtract(q.sqrt().square());
  }
}
