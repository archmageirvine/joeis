package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020472 Primes that contain digits 8 and 9 only.
 * @author Sean A. Irvine
 */
public class A020472 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '9').replace('0', '8'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
