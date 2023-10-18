package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A003557 n divided by largest squarefree divisor of n; if n = Product p(k)^e(k) then a(n) = Product p(k)^(e(k)-1), with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A003557 extends AbstractSequence implements DirectSequence {

  protected long mN = 0;

  /** Construct the sequence. */
  public A003557() {
    super(1);
  }

  @Override
  public Z next() {
    long p = 1;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z d : fs.toZArray()) {
      p *= d.longValue();
    }
    return Z.valueOf(mN / p);
  }

  @Override
  public Z a(final int n) {
    long p = 1;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z d : fs.toZArray()) {
      p *= d.longValue();
    }
    return Z.valueOf(n / p);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
