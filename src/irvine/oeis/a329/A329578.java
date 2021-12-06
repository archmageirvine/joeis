package irvine.oeis.a329;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A329578 First of three consecutive primes with common gap 48.
 * @author Sean A. Irvine
 */
public class A329578 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.equals(p.add(48)) && mPrime.nextPrime(q).equals(p.add(96))) {
        return p;
      }
    }
  }
}
