package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026022 Triangular array T read by rows: <code>T(n,0) = 1</code> for <code>n &gt;= 0; T(n,k) = C(n,k)</code> for k <code>= 1,2,...,n</code>, for <code>n = 1,2,3</code>; and for <code>n &gt;= 4, T(n,k) = T(n-1,k-1) + T(n-1,k)</code> for k <code>= 1,2,...,[ (n+2)/2 ]</code> and <code>T(n,(n+3)/2) = T(n-1,(n+1)/2)</code> if n is odd.
 * @author Sean A. Irvine
 */
public class A026022 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(n, m).subtract(Binomial.binomial(n, m - 4)).max(Z.ONE);
  }

  @Override
  public Z next() {
    final long lim = mN >= 3 ? (mN + 1) / 2 + 1 : mN;
    if (++mM > lim) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

