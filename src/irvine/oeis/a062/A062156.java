package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A062156 Number of n X n matrices over {0,1,2} with all row and column sums equal to 1 or 2.
 * @author Sean A. Irvine
 */
public class A062156 extends A062154 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    step();
    return mEgf.coeff(mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
