package irvine.oeis.a077;
// manually simbinom at 2023-03-17 15:01

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A077088 a(n) = phi(sigma(n) - phi(n)), where phi is Euler's totient function and sigma is the sum of divisors function, with a(1) = 0.
 * @author Georg Fischer
 */
public class A077088 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A077088() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : Functions.PHI.z(Functions.SIGMA.z(mN).subtract(Functions.PHI.z(Z.valueOf(mN))));
  }
}
