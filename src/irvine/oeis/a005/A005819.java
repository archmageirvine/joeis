package irvine.oeis.a005;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005819 Number of words of length n in a certain language.
 * @author Sean A. Irvine
 */
public class A005819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = mN == 1 ? Z.ZERO : Z.NEG_ONE;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN - k + 1).multiply(Euler.phiAsLong(k)));
    }
    return sum;
  }
}
