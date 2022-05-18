package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034729 a(n) = Sum_{ k, k|n } 2^(k-1).
 * @author Sean A. Irvine
 */
public class A034729 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Z.ONE.shiftLeft(dd.intValue() - 1));
    }
    return sum;
  }
}
