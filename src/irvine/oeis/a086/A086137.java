package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a023.A023202;

/**
 * A086137 Number of primes between p and p+8 if p is prime, i.e., number of primes between 8+A023202(n) and A023202(n).
 * @author Sean A. Irvine
 */
public class A086137 extends A023202 {

  @Override
  public Z next() {
    Z p = super.next();
    final Z p8 = p.add(8);
    long cnt = -1;
    do {
      p = mPrime.nextPrime(p);
      ++cnt;
    } while (p.compareTo(p8) < 0);
    return Z.valueOf(cnt);
  }
}

