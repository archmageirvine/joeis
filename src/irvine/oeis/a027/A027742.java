package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027742 a(n) = phi(4^n-1)/(2*n).
 * @author Sean A. Irvine
 */
public class A027742 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.PHI.z(Z.ONE.shiftLeft(2L * mN).subtract(1)).divide(2L * mN);
  }
}
