package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A062787 a(n) = floor(exp(gamma) n log log n ) - phi(n), where gamma is Euler's constant (A001620).
 * @author Sean A. Irvine
 */
public class A062787 extends Sequence2 {

  private static final CR EXP_GAMMA = CR.GAMMA.exp();
  private long mN = 1;

  @Override
  public Z next() {
    return EXP_GAMMA.multiply(++mN).multiply(CR.valueOf(mN).log().log()).floor().subtract(Functions.PHI.z(mN));
  }
}
