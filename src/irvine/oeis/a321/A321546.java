package irvine.oeis.a321;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321546 a(n) = Sum_{d|n} (-1)^(d-1)*d^7.
 * @author Sean A. Irvine
 */
public class A321546 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.signedAdd(d.isOdd(), d.pow(7));
    }
    return sum;
  }
}
