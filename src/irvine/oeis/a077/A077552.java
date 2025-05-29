package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077552 Consider the following triangle in which the n-th row contains n distinct numbers whose product is the smallest and has the least possible number of divisors. 1 is a member of only the first row. Sequence contains the final term of the rows (the leading diagonal).
 * @author Sean A. Irvine
 */
public class A077552 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.THREE;
    }
    return Z.ONE.shiftLeft(mN + 1);
  }
}
