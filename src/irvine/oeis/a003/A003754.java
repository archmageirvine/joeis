package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003754.
 * @author Sean A. Irvine
 */
public class A003754 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      long m = 3;
      while ((mN & m) != 0) {
        if (m > mN) {
          return Z.valueOf(mN);
        }
        m <<= 1;
      }
    }
  }
}
