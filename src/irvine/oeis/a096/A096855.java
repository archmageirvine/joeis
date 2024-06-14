package irvine.oeis.a096;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A096855 a(n) = A062401(2^n + 1).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A096855 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.PHI.z(Functions.SIGMA1.z(Z.ONE.shiftLeft(++mN).add(1)));
  }
}
