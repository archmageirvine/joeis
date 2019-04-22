package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020451.
 * @author Sean A. Irvine
 */
public class A020451 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '3').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
