package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005819 Number of words of length <code>n in a</code> certain language.
 * @author Sean A. Irvine
 */
public class A005819 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = mN == 1 ? Z.ZERO : Z.NEG_ONE;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN - k + 1).multiply(LongUtils.phi(k)));
    }
    return sum;
  }
}
