package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065047 Primes which when written in base 2 and prepended with a 1 produce a prime.
 * @author Sean A. Irvine
 */
public class A065047 extends A000040 {

  private Z mAdd = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mAdd) >= 0) {
        mAdd = mAdd.multiply2();
      }
      if (mAdd.add(p).isProbablePrime()) {
        return p;
      }
    }
  }
}

