package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a035.A035529;

/**
 * A049028 Row sums of triangle A035529.
 * @author Sean A. Irvine
 */
public class A049028 extends A035529 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}

