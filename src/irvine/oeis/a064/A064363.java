package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a059.A059306;

/**
 * A064363 Number of 2 X 2 regular integer matrices with elements from {0,...,n} up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A064363 extends A059306 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 3).multiply(mN).add(4).multiply(mN).add(1).multiply(mN + 1).subtract(super.next()).divide(4);
  }
}
