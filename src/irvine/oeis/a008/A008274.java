package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A008274 Total length of performances of n fragments in Stockhausen problem.
 * @author Sean A. Irvine
 */
public class A008274 extends A008270 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z nf = Functions.FACTORIAL.z(++mN);
    Z sum = super.next();
    for (int k = 1; k <= mN; ++k) {
      sum = sum.subtract(nf.multiply(k).divide(Functions.FACTORIAL.z(mN - k)));
    }
    for (int k = 2; k <= mN + 1; ++k) {
      sum = sum.subtract(nf.multiply(k).multiply(k - 2).divide(Functions.FACTORIAL.z(mN - k + 1)));
    }
    return sum;
  }
}

