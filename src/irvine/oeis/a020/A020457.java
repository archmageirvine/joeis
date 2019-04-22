package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020457 Primes that contain digits 1 and 9 only.
 * @author Sean A. Irvine
 */
public class A020457 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '9').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
