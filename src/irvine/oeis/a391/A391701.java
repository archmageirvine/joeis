package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391701 a(n) = phi(n) * (sigma(n) - tau(n)).
 * @author Sean A. Irvine
 */
public class A391701 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(++mN).subtract(Functions.SIGMA0.z(mN)).multiply(Functions.PHI.l(mN));
  }
}
