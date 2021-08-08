package irvine.oeis.a049;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049837 Triangular array T read by rows: T(n,k)=number of distinct numbers that appear when Euclidean algorithm acts on n,k, for k=1,2,...,n; n=1,2,3,...
 * @author Sean A. Irvine
 */
public class A049837 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  protected int t(final long n, final long k) {
    long a = n;
    long b = k;
    long r = 1;
    final HashSet<Long> seen = new HashSet<>();
    seen.add(n);
    seen.add(k);
    while (r > 0) {
      final long q = a / b;
      r = a - b * q;
      seen.add(r);
      seen.add(q);
      a = b;
      b = r;
    }
    return seen.size();
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
