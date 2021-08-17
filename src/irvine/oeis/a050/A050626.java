package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A050626 Product of digits of n is a nonzero square.
 * @author Sean A. Irvine
 */
public class A050626 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long p = ZUtils.digitProduct(++mN);
      if (p != 0) {
        final long s = LongUtils.sqrt(p);
        if (s * s == p) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
