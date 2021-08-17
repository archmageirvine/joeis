package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A050627 Product of digits of n is a nonzero single-digit square.
 * @author Sean A. Irvine
 */
public class A050627 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long p = ZUtils.digitProduct(++mN);
      if (p == 1 || p == 4 || p == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
