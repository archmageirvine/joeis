package irvine.oeis.a062;
// manually 2023-03-01

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062069 a(n) = sigma(d(n)), where d(k) is the number of divisors function (A000005) and sigma(k) is the sum of divisors function (A000203).
 * Formula: <code>a(n) = A000203(A000005(n)).</code>
 * @author Georg Fischer
 */
public class A062069 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(Functions.SIGMA0.z(++mN));
  }
}
