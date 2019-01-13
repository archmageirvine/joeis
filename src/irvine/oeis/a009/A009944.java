package irvine.oeis.a009;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009944.
 * @author Sean A. Irvine
 */
public class A009944 implements Sequence {

  private long mN = 125;

  @Override
  public Z next() {
    while (true) {
      long q = 0;
      long p = ++mN;
      while (p != 0) {
        q *= 10;
        q += p % 10;
        p /= 10;
        // q is already constructed in reverse
        if (LongUtils.reverse(p) * q == mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
