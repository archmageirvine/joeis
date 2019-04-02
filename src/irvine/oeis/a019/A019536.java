package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019536 a(n) = number of necklaces of n beads with up to n unlabeled colors.
 * @author Sean A. Irvine
 */
public class A019536 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] divisors = Cheetah.factor(++mN).divisors();
    final long[] divs = new long[divisors.length];
    for (int k = 0; k < divisors.length; ++k) {
      divs[k] = divisors[k].longValue();
    }
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (long k = 1; k <= mN; ++k, kf = kf.multiply(k)) {
      Z s = Z.ZERO;
      for (final long d : divs) {
        s = s.add(Stirling.secondKind(mN / d, k).multiply(LongUtils.phi(d)));
      }
      sum = sum.add(s.multiply(kf));
    }
    return sum.divide(mN);
  }
}

