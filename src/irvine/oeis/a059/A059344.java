package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059344 Triangle read by rows: row n consists of the nonzero coefficients of the expansion of 2^n x^n in terms of Hermite polynomials with decreasing subscripts.
 * @author Sean A. Irvine
 */
public class A059344 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z(mN - 2 * mM));
  }
}
