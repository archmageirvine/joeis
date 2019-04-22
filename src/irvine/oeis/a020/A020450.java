package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020450.
 * @author Sean A. Irvine
 */
public class A020450 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 2;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '2').replace('0', '1'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
