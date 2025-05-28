package irvine.oeis.a383;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383902 Square table read by ascending antidiagonals where T(n,k) = binomial(k+2^n-2,k).
 * @author Sean A. Irvine
 */
public class A383902 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Binomial.binomial(Z.ONE.shiftLeft(n).add(m - 2), m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
