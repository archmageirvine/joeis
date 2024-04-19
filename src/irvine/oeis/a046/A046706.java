package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046706 a(n) = (1/2)*(n+1)!*Sum_{k=0..floor(n/2)} n^(2k+1)/(2k+1)!.
 * @author Sean A. Irvine
 */
public class A046706 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z n = Z.valueOf(mN);
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN + 1).divide(Functions.FACTORIAL.z(2 * k + 1)).multiply(n));
      n = n.multiply(mN).multiply(mN);
    }
    return sum.divide2();
  }
}
