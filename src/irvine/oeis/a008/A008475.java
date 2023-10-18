package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A008475 If n = Product (p_j^k_j) then a(n) = Sum (p_j^k_j) (a(1) = 0 by convention).
 * @author Sean A. Irvine
 */
public class A008475 extends AbstractSequence implements DirectSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A008475() {
    super(1);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(fs.getExponent(p)));
      }
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    if (n.compareTo(Z.ONE) > 0) {
      final FactorSequence fs = Jaguar.factor(n);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(fs.getExponent(p)));
      }
    }
    return sum;
  }

}
