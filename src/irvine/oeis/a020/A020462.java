package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020462 Primes that contain digits 3 and 5 only.
 * @author Sean A. Irvine
 */
public class A020462 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.THREE;
    } else if (mN == 1) {
      mN = 4;
      return Z.FIVE;
    }
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '5').replace('0', '3'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
