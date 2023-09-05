package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065507 Smallest prime q such that (p^q+1)/(p+1) is a prime, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A065507 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p1 = p.add(1);
    long q = 2;
    while (true) {
      q = mPrime.nextPrime(q);
      if (p.pow(q).add(1).divide(p1).isProbablePrime()) {
        return Z.valueOf(q);
      }
    }
  }
}
