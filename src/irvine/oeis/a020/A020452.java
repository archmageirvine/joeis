package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020452 Primes that contain digits 1 and 4 only.
 * @author Sean A. Irvine
 */
public class A020452 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '4').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
