package irvine.oeis.a211;
// manually sumsi/sumgcd at 2021-11-20 20:50

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A211932 a(n) = Sum_{ m=1..n and gcd(n,m)&gt;1 } tau(m), tau(m)=A000005(m).
 * @author Georg Fischer
 */
public class A211932 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      if (gd > 1) {
        sum = sum.add(irvine.factor.factor.Cheetah.factor(k).sigma0());
      }
    }
    return sum;
  }
}
