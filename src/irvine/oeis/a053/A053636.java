package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053636 a(n) = Sum_{odd d|n} phi(d)*2^(n/d).
 * @author Sean A. Irvine
 */
public class A053636 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(Functions.PHI.z(d).shiftLeft(mN / d.longValue()));
      }
    }
    return sum;
  }
}
