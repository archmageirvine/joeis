package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A068068 Number of odd unitary divisors of n. d is a unitary divisor of n if d divides n and gcd(d,n/d) = 1.
 * @author Sean A. Irvine
 */
public class A068068 extends Sequence1 implements DirectSequence {

  protected int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    long c = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValueExact();
      if (dd.testBit(0) && Functions.GCD.z(dd, n.divide(dd)).isOne()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    long c = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValueExact();
      if ((d & 1) == 1 && Functions.GCD.l(d, n / d) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

}
