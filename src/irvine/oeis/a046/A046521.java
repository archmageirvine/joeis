package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046521 Array T(i,j) = binomial(-1/2-i,j)*(-4)^j, i,j &gt;= 0 read by antidiagonals going down.
 * @author Sean A. Irvine
 */
public class A046521 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(2 * n, n).multiply(Binomial.binomial(n, m)).divide(Binomial.binomial(2 * m, m));
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

