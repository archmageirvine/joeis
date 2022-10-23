package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020458 Primes that contain digits 2 and 3 only.
 * @author Sean A. Irvine
 */
public class A020458 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '3').replace('0', '2'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
