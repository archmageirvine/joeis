package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085124 Smallest multiple of n whose digital product is also a positive multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085124 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0 || !Predicates.SMOOTH.is(7, mN)) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      k += mN;
      final Z dp = Functions.DIGIT_PRODUCT.z(k);
      if (!dp.isZero() && dp.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
