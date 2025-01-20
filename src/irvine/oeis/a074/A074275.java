package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074275 Positions of occurrences of 1,2,2,1,2 in the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A074275 extends A000002 {

  private long mN = -4;
  private long mT = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT <<= 1;
      mT += super.next().longValue() - 1;
      if ((mT & 0x1F) == 0b01101) {
        return Z.valueOf(mN);
      }
    }
  }
}
