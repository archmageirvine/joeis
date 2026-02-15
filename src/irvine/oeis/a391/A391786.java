package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a045.A045723;

/**
 * A391786 Triangle read by rows: T(n, k) = number of reversible strings with n black beads and k white beads, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A391786 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final DirectSequence mA = new A045723();

  private Z s1(final int n, final int k) {
    if ((n & 1) == 1 && (k & 1) == 1) {
      return Z.ZERO;
    }
    return Binomial.binomial((n + k) / 2, k / 2);
  }

  private Z t(final int n, final int m) {
    if (n == m) {
      return mA.a(n);
    }
    return s1(n, m).add(Binomial.binomial(n + m, n)).divide2();
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
