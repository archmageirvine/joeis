package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053607 Primes p such that a pure prime power occurs between p and the next prime.
 * @author Sean A. Irvine
 */
public class A053607 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      for (Z m = p.add(1); !m.equals(q); m = m.add(1)) {
        if (Jaguar.factor(m).omega() == 1) {
          return p;
        }
      }
    }
  }
}
