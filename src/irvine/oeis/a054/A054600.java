package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054600 Sum_{d|n, d odd} d*2^(n/d).
 * @author Sean A. Irvine
 */
public class A054600 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(d.shiftLeft(mN / d.intValue()));
      }
    }
    return sum;
  }
}
