package irvine.oeis.a163;
// manually 2023-03-01

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163109 a(n) = phi(tau(n)).
 * Formula: <code>a(n) = A000010(A000005(n)).</code>
 * @author Georg Fischer
 */
public class A163109 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Functions.SIGMA0.z(++mN);
    return Functions.PHI.z(n);
  }
}
