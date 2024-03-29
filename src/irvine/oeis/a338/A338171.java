package irvine.oeis.a338;
// Generated by gen_seq4.pl sumdiv3 at 2023-04-11 14:46

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A338171 a(n) is the sum of those divisors d of n such that tau(d) divides sigma(d).
 * @author Georg Fischer
 */
public class A338171 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A338171() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final FactorSequence fsd = Jaguar.factor(d);
      sum = sum.add(fsd.sigma().mod(fsd.sigma0()).isZero() ? dd : Z.ZERO);
    }
    return sum;
  }
}
