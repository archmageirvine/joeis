package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071194 Length (&gt;1) of shortest sequence of consecutive primes starting with prime(n) whose sum is also prime, or -1 if no such sequence exists.
 * @author Sean A. Irvine
 */
public class A071194 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z s = p;
    long k = 1;
    do {
      p = mPrime.nextPrime(p);
      s = s.add(p);
      ++k;
    } while (!s.isProbablePrime());
    return Z.valueOf(k);
  }
}
