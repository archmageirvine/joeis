package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039646 Third column of Jabotinsky-triangle A038455 related to A006963.
 * @author Sean A. Irvine
 */
public class A039646 extends Sequence0 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(k, 3).multiply(Binomial.binomial(2L * mN, mN - k)).multiply(Functions.FACTORIAL.z(mN - 1)).divide(Functions.FACTORIAL.z(k - 1)));
    }
    return sum;
  }
}
