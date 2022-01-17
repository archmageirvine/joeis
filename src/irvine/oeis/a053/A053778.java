package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A053778 First of four consecutive primes that comprise two sets of twin primes.
 * @author Sean A. Irvine
 */
public class A053778 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p.add(2));
      if (mPrime.nextPrime(q).equals(q.add(2))) {
        return p;
      }
    }
  }
}
