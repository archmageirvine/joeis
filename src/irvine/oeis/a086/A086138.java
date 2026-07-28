package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a023.A023203;

/**
 * A086138 Number of primes between p and p+10 if both p and (p+10) are prime, i.e., number of primes somewhere between 10+A023203(n) and A023203(n).
 * @author Sean A. Irvine
 */
public class A086138 extends A023203 {

  @Override
  public Z next() {
    Z p = super.next();
    final Z q = p.add(10);
    long cnt = -1;
    do {
      p = mPrime.nextPrime(p);
      ++cnt;
    } while (p.compareTo(q) < 0);
    return Z.valueOf(cnt);
  }
}

