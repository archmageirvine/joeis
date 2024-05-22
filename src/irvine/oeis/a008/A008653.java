package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008653 Theta series of direct sum of 2 copies of hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A008653 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Functions.SIGMA1.z(3 * mN).subtract(Functions.SIGMA1.z(mN).multiply(3)).multiply(12);
  }
}
