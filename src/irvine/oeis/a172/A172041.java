package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A172041 Primes of the form 2^p-3 with p also prime.
 * @author Sean A. Irvine
 */
public class A172041 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TWO.pow(super.next()).subtract(3);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

