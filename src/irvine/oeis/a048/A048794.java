package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048794 Subsets of natural numbers arranged in standard statistical (or Yates) order.
 * @author Sean A. Irvine
 */
public class A048794 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else {
      final StringBuilder sb = new StringBuilder();
      long k = 0;
      long m = mN;
      while (m != 0) {
        ++k;
        if ((m & 1) == 1) {
          sb.append(k);
        }
        m >>>= 1;
      }
      return new Z(sb);
    }
  }
}
