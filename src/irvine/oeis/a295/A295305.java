package irvine.oeis.a295;
// manually 2024-06-29 *GF

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A295305 a(n) = tau(sigma(n)) - tau(n), where tau is the number of divisors (A000005) and sigma is the sum of divisors of n (A000203).
 * @author Georg Fischer
 */
public class A295305 extends AbstractSequence implements DirectSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A295305() {
    super(1);
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return Functions.SIGMA0.z(fs.sigma()).subtract(fs.tau());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
