package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079080 a(n) = gcd((prime(n)+1)*(prime(n+1)+1)/4, prime(n)*prime(n+1)+1).
 * @author Sean A. Irvine
 */
public class A079080 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return p.add(1).multiply(q.add(1)).divide(4).gcd(p.multiply(q).add(1));
  }
}
