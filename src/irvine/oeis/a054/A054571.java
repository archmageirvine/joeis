package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054571 a(n) = phi(n - phi(n)), a(1) = 0.
 * @author Sean A. Irvine
 */
public class A054571 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    }
    return Functions.PHI.z(mN.subtract(Functions.PHI.z(mN)));
  }
}
