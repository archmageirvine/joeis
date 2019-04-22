package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020471.
 * @author Sean A. Irvine
 */
public class A020471 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z m = new Z(Long.toBinaryString(++mN).substring(1).replace('1', '9').replace('0', '7'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
