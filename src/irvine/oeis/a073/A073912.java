package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073912 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 5 == 0) {
      return Z.ZERO;
    }
    if (Functions.GPF.l(mN) > 7) {
      return Z.ZERO;
    }
    long k = 0;
    final long add = 8 * mN;
    while (true) {
      k += add;
      final Z prod = Functions.DIGIT_PRODUCT.z(k);
      if (!prod.isZero() && prod.mod(add) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

