package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020449 Primes whose greatest digit is 1.
 * @author Sean A. Irvine
 */
public class A020449 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
