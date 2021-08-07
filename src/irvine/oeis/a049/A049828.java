package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049828 Triangular array T given by rows: T(n,k)=sum of remainders when Euclidean algorithm acts on n,k; for k=1,2,...,n; n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049828 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  protected long t(final long n, final long m) {
    return n * m == 0 ? 0 : n % m + t(m, n % m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN - mM, mM));
  }
}
