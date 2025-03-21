package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A019555 Smallest number whose cube is divisible by n.
 * @author Sean A. Irvine
 */
public class A019555 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      res = res.multiply(p.pow((fs.getExponent(p) + 2) / 3));
    }
    return res;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
