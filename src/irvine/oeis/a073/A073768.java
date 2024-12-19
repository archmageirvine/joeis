package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073768 Triangle of coefficients of Bateman polynomial n!Z_n(-x).
 * @author Sean A. Irvine
 */
public class A073768 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mN)
      .divide(Functions.FACTORIAL.z(mN - mM))
      .multiply(Functions.FACTORIAL.z(mN + mM))
      .divide(Functions.FACTORIAL.z(mM).pow(3));
  }
}
