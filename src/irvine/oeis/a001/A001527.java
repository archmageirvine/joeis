package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001527 <code>a(n) = 2 * Sum_{i=0..n} C(2^n-1, i)</code>.
 * @author Sean A. Irvine
 */
public class A001527 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    Z s = Z.ZERO;
    final long m = (1L << mN) - 1;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(m, k));
    }
    return s.multiply2();
  }
}
