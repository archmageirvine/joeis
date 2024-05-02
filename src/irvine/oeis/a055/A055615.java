package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055615 a(n) = n * mu(n), where mu is the M\u00f6bius function A008683.
 * @author Sean A. Irvine
 */
public class A055615 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Functions.MOBIUS.i(++mN) * mN);
  }
}
