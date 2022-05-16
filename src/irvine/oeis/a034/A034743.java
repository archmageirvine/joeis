package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034743 a(n) = Sum_{d | n} mu(n/d) * Bell(d-1).
 * @author Sean A. Irvine
 */
public class A034743 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(BellNumbers.bell(d - 1).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
