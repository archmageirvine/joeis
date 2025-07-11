package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078686 Primes prime(k) such that 2^k - prime(k) is also prime.
 * @author Sean A. Irvine
 */
public class A078686 extends A000040 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mA = mA.multiply2();
      final Z t = mA.subtract(p);
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}

