package irvine.oeis.a039;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039599 Triangle formed from even-numbered columns of triangle of expansions of powers of x in terms of Chebyshev polynomials U_n(x).
 * @author Sean A. Irvine
 */
public class A039599 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      if (++mN == 0) {
        return Z.ONE;
      }
    }
    final long t = 2 * mN - 1;
    return Binomial.binomial(t, mN - mM).subtract(Binomial.binomial(t, mN - mM - 2));
  }
}
