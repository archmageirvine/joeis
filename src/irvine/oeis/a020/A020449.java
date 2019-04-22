package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020449 Primes that contain digits 0 and 1 only.
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
