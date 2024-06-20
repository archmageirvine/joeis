package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A051027 a(n) = sigma(sigma(n)) = sum of the divisors of the sum of the divisors of n.
 * Formula: <code>a(n) = A000203(A000203(n)).</code>
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A051027 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SIGMA1.z(Functions.SIGMA1.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.SIGMA1.z(Functions.SIGMA1.z(n));
  }
}
