package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074277 Positions of occurrences of 1,1,2,1,2,2,1,1,2 in the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A074277 extends A000002 {

  private long mN = -8;
  private long mT = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT <<= 1;
      mT += super.next().longValue() - 1;
      if ((mT & 0x1FF) == 0b001011001) {
        return Z.valueOf(mN);
      }
    }
  }
}
