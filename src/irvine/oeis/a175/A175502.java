package irvine.oeis.a175;

import java.util.HashSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A175502 <code>a(1) = 1. a(n) =</code> the smallest integer not yet occurring such that each unordered pair <code>{d(a(k)),d(a(k-1))}</code> occurs only once at most, for <code>2&lt;= k &lt;= n</code>, where d(m) = the number of divisors of m.
 * @author Sean A. Irvine
 */
public class A175502 implements Sequence {

  private long mMin = 2;
  private long mLastDivisors = 1;
  private final HashSet<Z> mUsed = new HashSet<>();
  private final HashSet<String> mUsedD = new HashSet<>();

  @Override
  public Z next() {
    if (mUsed.isEmpty()) {
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    long n = mMin;
    while (true) {
      final Z zn = Z.valueOf(n);
      if (!mUsed.contains(zn)) {
        final long dc = Cheetah.factor(zn).sigma0AsLong();
        final long a, b;
        if (mLastDivisors < dc) {
          a = mLastDivisors;
          b = dc;
        } else {
          a = dc;
          b = mLastDivisors;
        }
        if (mUsedD.add(a + "_" + b)) {
          mUsed.add(zn);
          mLastDivisors = dc;
          if (n == mMin) {
            mMin = n + 1;
          }
          return zn;
        }
      }
      ++n;
    }
  }
}
