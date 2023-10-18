package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A003415 a(n) = n' = arithmetic derivative of n: a(0) = a(1) = 0, a(prime) = 1, a(m*n) = m*a(n) + n*a(m).
 * @author Sean A. Irvine
 */
public class A003415 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003415(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003415() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z s = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s = s.add((mN / p.longValueExact()) * fs.getExponent(p));
    }
    return s;
  }

  @Override
  public Z a(final int n) {
    if (n < 2) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z s = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s = s.add((n / p.longValueExact()) * fs.getExponent(p));
    }
    return s;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
