package irvine.oeis.a096;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A096856 a(n) = A062402(2^n+1).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A096856 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(Functions.PHI.z(Z.ONE.shiftLeft(++mN).add(1)));
  }
}
