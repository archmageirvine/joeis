package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384763 Product of the Euler totients of the unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A384763 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(++mN).pow(Z.ONE.shiftLeft(Functions.OMEGA.l(mN) - 1));
  }
}

