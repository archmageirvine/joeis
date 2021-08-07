package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049816 Triangular array T read by rows: T(n,k)=number of nonzero remainders when Euclidean algorithm acts on n and k, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A049816 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  private long r(final long n, final long m) {
    final long r = n % m;
    return r == 0 ? 1 : r(m, r) + 1;
  }

  protected long t(final long n, final long m) {
    return r(n, m) - 1;
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
