package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049834 Triangular array T given by rows: T(n,k)=sum of quotients when Euclidean algorithm acts on n and k; for k=1,2,...,n; n=1,2,3,...; also number of subtraction steps when computing gcd(n,k) using subtractions rather than divisions.
 * @author Sean A. Irvine
 */
public class A049834 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;
  private long mM = 0;

  protected long t(final long n, final long k) {
    long a = n;
    long b = k;
    long r = 1;
    long s = 0;
    while (r > 0) {
      final long q = a / b;
      r = a - b * q;
      s += q;
      a = b;
      b = r;
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
  }
}
