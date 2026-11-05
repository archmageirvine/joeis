package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087294 Primes resulting from A087293.
 * @author Sean A. Irvine
 */
public class A087294 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = mPrime.nextPrime(p).multiply(p).square().add(1).divide2();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

