package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a059.A059306;

/**
 * A064276 Number of 2 X 2 singular integer matrices with elements from {0,...,n} up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A064276 extends A059306 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(Z.valueOf(++mN).multiply(2 * mN + 1)).divide(4);
  }
}

