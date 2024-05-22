package irvine.oeis.a062;
// manually 2023-03-01

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062401 a(n) = phi(sigma(n)).
 * @author Georg Fischer
 */
public class A062401 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Functions.SIGMA1.z(++mN);
    return Functions.PHI.z(n);
  }
}
