package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006588 a(n) = 4^n*(3*n)!/((2*n)!*n!).
 * @author Sean A. Irvine
 */
public class A006588 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(3 * mN).divide(Functions.FACTORIAL.z(2 * mN)).shiftLeft(2L * mN).divide(Functions.FACTORIAL.z(mN));
  }
}
