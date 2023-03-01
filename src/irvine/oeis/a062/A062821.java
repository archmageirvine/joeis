package irvine.oeis.a062;
// manually 2023-03-01

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062821 Number of divisors of totient of n.
 * Formula: <code>a(n) = A000005(A000010(n)).</code>
 * @author Georg Fischer
 */
public class A062821 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(Euler.phi(Z.valueOf(++mN))).sigma0();
  }
}
