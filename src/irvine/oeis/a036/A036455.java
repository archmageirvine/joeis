package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a010.A010553;

/**
 * A036455 Numbers n such that d(d(n)) is an odd prime, where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A036455 extends A010553 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (s.isOdd() && s.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

