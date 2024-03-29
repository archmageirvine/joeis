package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060256 Smallest multiple a(n) of n-th primorial q(n) such that a(n)*q(n)-1 and a(n)*q(n)+1 are a pair of twin primes.
 * @author Sean A. Irvine
 */
public class A060256 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    Z u = Z.ZERO;
    long k = 0;
    while (true) {
      ++k;
      u = u.add(t);
      if (u.subtract(1).isProbablePrime() && u.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
