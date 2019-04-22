package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020456.
 * @author Sean A. Irvine
 */
public class A020456 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '8').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
