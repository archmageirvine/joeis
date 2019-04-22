package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020463.
 * @author Sean A. Irvine
 */
public class A020463 implements Sequence {

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
