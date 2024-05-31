package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046165 Number of minimal covers of n objects.
 * @author Sean A. Irvine
 */
public class A046165 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      for (int j = k; j <= mN; ++j) {
        sum = sum.add(Binomial.binomial(mN, j).multiply(Functions.STIRLING2.z(j, k)).multiply(Z.ONE.shiftLeft(k).subtract(k + 1).pow(mN - j)));
      }
    }
    return sum;
  }
}
