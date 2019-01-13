package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003726.
 * @author Sean A. Irvine
 */
public class A003726 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long m = 7;
      while ((mN & m) != m) {
        if (m > mN) {
          return Z.valueOf(mN);
        }
        m <<= 1;
      }
    }
  }
}
