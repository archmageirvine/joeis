package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001192 Number of full sets of size <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001192 extends MemorySequence {

  private int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN > 62) {
      throw new UnsupportedOperationException();
    }
    final long p = (1L << mN) + mN - 1;
    Z s = Binomial.binomial(p, mN);
    if ((mN & 1) == 1) {
      s = s.negate();
    }
    long u = 1;
    for (int k = 0; k < mN; ++k) {
      final Z t = Binomial.binomial(p + u - k, mN - k).multiply(get(k));
      s = s.signedAdd(((mN - k) & 1) == 1, t);
      u <<= 1;
    }
    return s;
  }
}
