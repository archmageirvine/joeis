package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085909 Smallest prime p&gt;prime(n) such that p+prime(n+1)-prime(n) is the next prime after p; or a(n)=0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A085909 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ZERO;
    }
    Z q = mPrime.nextPrime(p);
    Z r = mPrime.nextPrime(q);
    final Z t = q.subtract(p);
    while (true) {
      final Z u = t.add(q);
      if (r.equals(u)) {
        return q;
      }
      q = r;
      r = mPrime.nextPrime(r);
    }
  }
}
