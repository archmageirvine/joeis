package irvine.oeis.a243;
// manually simbinom at 2023-03-17 20:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A243997 a(n) = phi(sigma(n) - phi(n) - d(n)), where phi(n) is the Euler totient function, sigma(n) the sum of divisors of n and d(n) the number of divisors of n.
 * @author Georg Fischer
 */
public class A243997 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A243997() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z t = Functions.SIGMA1.z(mN).subtract(Functions.PHI.z(mN)).subtract(Functions.SIGMA0.z(mN));
    return t.isZero() ? Z.ZERO : Functions.PHI.z(t.abs());
  }
}
