package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020469 Primes that contain digits 6 and 7 only.
 * @author Sean A. Irvine
 */
public class A020469 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '7').replace('0', '6'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
