package irvine.oeis.a334;
// Generated by gen_seq4.pl sumdiv3 at 2023-04-11 14:46

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A334793 a(n) = Sum_{d|n} lcm(tau(d), pod(d)) where tau(k) is the number of divisors of k (A000005) and pod(k) is the product of divisors of k (A007955).
 * @author Georg Fischer
 */
public class A334793 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A334793() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final FactorSequence fsd = Jaguar.factor(d);
      sum = sum.add(fsd.sigma0().lcm(fsd.pod()));
    }
    return sum;
  }
}
