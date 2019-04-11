package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007928 Numbers containing an even digit.
 * @author Sean A. Irvine
 */
public class A007928 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      do {
        if ((m & 1) == 0) {
          return Z.valueOf(mN);
        }
        m /= 10;
      } while (m != 0);
    }
  }
}
