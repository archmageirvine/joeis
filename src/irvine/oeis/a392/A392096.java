package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A392096 allocated for Hartmut F. W. Hoft.
 * @author Sean A. Irvine
 */
public class A392096 extends Sequence1 {

  // After Hartmut F. W. Hoft

  private long mN = 0;

  private boolean divQ(final int k, final long d1, final long d2, final long d3) {
    final Z pow = Z.ONE.shiftLeft(k + 1);
    return pow.multiply(d1).compareTo(d2) > 0 && pow.multiply(d2).compareTo(d3) < 0;
  }

  private boolean is(final long n) {
    // oP = n with all factors of 2 removed
    final long oP = Functions.MAKE_ODD.l(n);
    // k = Log[2, n/oP]
    final long ratio = n / oP;
    final int k = Long.numberOfTrailingZeros(ratio);
    // dL = Divisors[oP]
    final long[] dL = ZUtils.toLong(Jaguar.factor(oP).divisorsSorted());
    if (dL.length <= 2) {
      return false;
    }
    for (int i = 0; i + 2 < dL.length; i += 2) {
      if (!divQ(k, dL[i], dL[i + 1], dL[i + 2])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

