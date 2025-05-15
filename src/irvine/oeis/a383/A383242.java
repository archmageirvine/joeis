package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A383242 a(n) = p(n)*p(n+1)*(p(n+1) - p(n)) + 1, where p(n) = prime(n).
 * @author Sean A. Irvine
 */
public class A383242 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return p.multiply(q).multiply(q.subtract(p)).add(1);
  }
}

