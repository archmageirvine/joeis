package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020453 Primes that contain digits 1 and 5 only.
 * @author Sean A. Irvine
 */
public class A020453 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 2;
      return Z.FIVE;
    }
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '5').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
