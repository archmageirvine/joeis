package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A051193 a(n) = Sum_{k=1..n} lcm(n,k).
 * @author Sean A. Irvine
 */
public class A051193 extends Sequence1 implements DirectSequence {

  protected int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ONE;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(d.multiply(Functions.PHI.z(d)));
    }
    return sum.multiply(n).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
