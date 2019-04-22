package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020465.
 * @author Sean A. Irvine
 */
public class A020465 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '7').replace('0', '4'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
