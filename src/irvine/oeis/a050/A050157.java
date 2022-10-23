package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050157 T(n, k) = S(2n, n, k) for 0&lt;=k&lt;=n and n&gt;=0, where S(p, q, r) is the number of upright paths from (0, 0) to (p, p-q) that do not rise above the line y = x-r.
 * @author Sean A. Irvine
 */
public class A050157 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN, mN).subtract(Binomial.binomial(2 * mN, mN + mM + 1));
  }
}
