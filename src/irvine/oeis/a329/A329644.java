package irvine.oeis.a329;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a323.A323244;

/**
 * A329644 M\u00f6bius transform of A323244, the deficiency of A156552(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A329644 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA323244 = new A323244();
  private int mN = 0;

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(mA323244.a(d).multiply(Functions.MOBIUS.l(n.divide(d))));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
