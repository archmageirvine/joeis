package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067310 Square table read by antidiagonals of number of ways of arranging n chords on a circle with k simple intersections (i.e., no intersections with 3 or more chords).
 * @author Sean A. Irvine
 */
public class A067310 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z c(final long n, final long m) {
    return n >= m && m >= 0 ? Binomial.binomial(n, m) : Z.ZERO;
  }

  protected Z t(final int n, final int k) {
    if (n == 0 && k == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n - 1, j -> Z.NEG_ONE.pow(j)
      .multiply(c((long) (n - j) * (n - j + 1) / 2 - 1 - k, n - 1))
      .multiply(c(2L * n, j).subtract(c(2L * n, j - 1))));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
