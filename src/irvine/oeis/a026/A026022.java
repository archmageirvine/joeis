package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026022 Triangular array T read by rows: T(n, 0) = 1 for n &gt;= 0; T(n,k) = C(n,k) for k = 1, 2,...,n, for n = 1, 2, 3; and for n &gt;= 4, T(n,k) = T(n-1,k-1) + T(n-1,k) for k = 1, 2,...,[ (n+2)/2 ] and T(n,(n+3)/2) = T(n-1,(n+1)/2) if n is odd.
 * @author Sean A. Irvine
 */
public class A026022 extends AbstractSequence {

  /* Construct the sequence. */
  public A026022() {
    super(1);
  }

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

