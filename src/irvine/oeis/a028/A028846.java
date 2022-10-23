package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A028846 Numbers whose product of digits is a power of 2.
 * @author Sean A. Irvine
 */
public class A028846 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final long u = ZUtils.digitProduct(n);
      if (u != 0 && (u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
