package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A392781 Length of the longest reduced word in the cyclic group C_n.
 * @author Sean A. Irvine
 */
public class A392781 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum = sum.add(Z.TWO.equals(p) ? (e + 1) / 2 : e * (p.longValue() - 1) / 2);
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
