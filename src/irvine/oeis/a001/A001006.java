package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001006 Motzkin numbers: number of ways of drawing any number of nonintersecting chords joining n (labeled) points on a circle.
 * @author Sean A. Irvine
 */
public class A001006 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(mN - k, k - 1)));
    }
    return sum.divide(mN);
  }
}
