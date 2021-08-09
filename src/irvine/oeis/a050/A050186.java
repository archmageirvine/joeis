package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050186 Triangular array T read by rows: T(h,k) = number of binary words of k 1's and h-k 0's which are not a juxtaposition of 2 or more identical subwords.
 * @author Sean A. Irvine
 */
public class A050186 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return mN <= 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long d = dd.longValue();
      final int mobius = Mobius.mobius(d);
      if (mobius != 0) {
        sum = sum.signedAdd(mobius == 1, Binomial.binomial(mN / d, mM / d));
      }
    }
    return sum;
  }
}
