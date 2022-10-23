package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020463 Primes that contain digits 3 and 7 only.
 * @author Sean A. Irvine
 */
public class A020463 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '7').replace('0', '3'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
