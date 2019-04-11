package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006579 Sum of gcd(n,k) for <code>k = 1</code> to <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A006579 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(LongUtils.gcd(mN, k));
    }
    return sum;
  }
}
