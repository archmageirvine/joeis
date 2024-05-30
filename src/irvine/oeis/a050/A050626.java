package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050626 Product of digits of n is a nonzero square.
 * @author Sean A. Irvine
 */
public class A050626 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long p = Functions.DIGIT_PRODUCT.l(v);
      if (p != 0) {
        final long s = Functions.SQRT.l(p);
        if (s * s == p) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
