package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060255 Smaller of twin primes {p, p+2} whose average p+1 = k*q is the least multiple of the n-th primorial number q such that k*q-1 and k*q+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A060255 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    Z u = Z.ZERO;
    while (true) {
      u = u.add(t);
      if (u.subtract(1).isProbablePrime() && u.add(1).isProbablePrime()) {
        return u.subtract(1);
      }
    }
  }
}
