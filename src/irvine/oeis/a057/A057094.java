package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057094 Coefficient triangle for certain polynomials (rising powers).
 * @author Sean A. Irvine
 */
public class A057094 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (n == 0 && m == 0) {
      return Z.ZERO;
    }
    if (m < n / 2 + 1) {
      return Z.ZERO;
    }
    final Z b = Binomial.binomial(m - 1, n - m);
    return ((n - m) & 1) == 1 ? b : b.negate();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
