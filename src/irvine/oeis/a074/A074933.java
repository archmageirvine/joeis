package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.TWO;
    }
    final Z[] qr = Z.ONE.shiftLeft(mN).divideAndRemainder(mN);
    final long r = qr[1].longValueExact();
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(qr[0]);
        if (k <= r) {
          sum = sum.add(1);
        }
      }
    }
    return sum;
  }
}
