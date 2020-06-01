package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026009 Triangular array T read by rows: <code>T(n,0) = 1</code> for <code>n &gt;= 0; T(1,1) = 1;</code> and for <code>n &gt;= 2, T(n,k) = T(n-1,k-1) + T(n-1,k)</code> for k <code>= 1,2,...,[(n+1)/2]; T(n,n/2 + 1) = T(n-1,n/2)</code> if n is even.
 * @author Sean A. Irvine
 */
public class A026009 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(n, m).subtract(Binomial.binomial(n, m - 3)).max(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mM > mN / 2 + 1) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

