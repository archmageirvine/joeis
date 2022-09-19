package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a059.A059050;

/**
 * A051115 Number of monotone Boolean functions of n variables with 7 mincuts.
 * @author Sean A. Irvine
 */
public class A051115 extends A059050 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final long[] c : PARMS) {
      sum = sum.add(Z.valueOf(c[1]).pow(mN).multiply(c[0]));
    }
    return sum.divide(5040);
  }
}
