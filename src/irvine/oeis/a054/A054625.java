package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054625 Number of n-bead necklaces with 6 colors.
 * a(0) = 1; a(n) = (1/n) * Sum_{k=1..n} 6^gcd(n,k).
 *
 * @author Georg Fischer
 */
public class A054625 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Z.SIX.pow(LongUtils.gcd(mN, k)));
    }
    return sum.divide(mN);
  }
}
