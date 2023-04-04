package irvine.oeis.a001;

import irvine.math.partitions.NonnegativeIntegerComposition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001827 Related to graded partially ordered sets.
 * @author Sean A. Irvine
 */
public class A001827 extends Sequence0 {

  private int mN = -1;

  // c(h,n) following Eq (4) of Klarner

  static Z c(final int h, final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    if (h == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final NonnegativeIntegerComposition composition = new NonnegativeIntegerComposition(n, h);
    int[] c;
    while ((c = composition.next()) != null) {
      long p = 0;
      for (int k = 1; k < c.length; ++k) {
        p += c[k - 1] * (long) c[k];
      }
      if (p > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException();
      }
      sum = sum.add(Binomial.multinomial(n, c).shiftLeft((int) p));
    }
    return sum;
  }

  @Override
  public Z next() {
    return c(4, ++mN);
  }
}
