package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A008480 Number of ordered prime factorizations of n.
 * @author Sean A. Irvine
 */
public class A008480 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum = sum.add(e);
      prod = prod.multiply(Functions.FACTORIAL.z(e));
    }
    return Functions.FACTORIAL.z(sum).divide(prod);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
