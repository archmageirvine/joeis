package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061067 m-th prime prime(m) is included iff prime(m) + m is also prime.
 * @author Sean A. Irvine
 */
public class A061067 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.add(++mN))) {
        return p;
      }
    }
  }
}
