package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a046.A046133;

/**
 * A086139 Let p = A046133(n), that is, let p run through the list of primes such that p+12 is also prime (A046133); a(n) = number of primes in the interval p + 1 through p + 11 inclusive.
 * @author Sean A. Irvine
 */
public class A086139 extends A046133 {

  @Override
  public Z next() {
    Z p = super.next();
    final Z q = p.add(12);
    long cnt = -1;
    do {
      p = mPrime.nextPrime(p);
      ++cnt;
    } while (p.compareTo(q) < 0);
    return Z.valueOf(cnt);
  }
}

