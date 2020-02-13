package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028889.
 * @author Sean A. Irvine
 */
public class A028889 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = LongUtils.digitProduct(u);
      }
      if (u != 0 && (u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
