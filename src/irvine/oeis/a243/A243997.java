package irvine.oeis.a243;
// manually simbinom at 2023-03-17 20:00

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
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
    final Z t = Jaguar.factor(mN).sigma().subtract(Euler.phi(Z.valueOf(mN))).subtract(Jaguar.factor(mN).tau());
    return t.isZero() ? Z.ZERO : Euler.phi(t.abs());
  }
}
