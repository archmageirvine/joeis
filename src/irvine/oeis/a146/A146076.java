package irvine.oeis.a146;
// manually 2023-12-25

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A146076 Sum of even divisors of n.
 * @author Georg Fischer
 */
public class A146076 extends AbstractSequence implements DirectSequence {

  protected long mN = 0;

  /** Construct the sequence. */
  public A146076() {
    super(1);
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z d : fs.divisors()) {
      if (!d.testBit(0)) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
