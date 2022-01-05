package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053636 a(n) = Sum_{odd d|n} phi(d)*2^(n/d).
 * @author Sean A. Irvine
 */
public class A053636 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(Euler.phi(d).shiftLeft(mN / d.intValue()));
      }
    }
    return sum;
  }
}
