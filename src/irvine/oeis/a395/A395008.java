package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395008 Numbers k representable as a sum of three squares at which the minimal three-square spread s3(k) reaches a new record value, where s3(k) is the least value of x-z over all representations k = x^2 + y^2 + z^2 with x &gt;= y &gt;= z &gt;= 0.
 * @author Sean A. Irvine
 */
public class A395008 extends Sequence1 {

  // After Nenad Micic

  private long mBest = -1;
  private long mN = 0;

  private boolean isSum3(long n) {
    if (n < 1) {
      return n == 0;
    }
    while ((n & 3) == 0) {
      n >>>= 2;
    }
    return (n & 7) != 7;
  }

  private long s3(final long n) {
    long b = Long.MAX_VALUE;
    final long zr = Functions.SQRT.l(n / 3);
    for (long z = zr; z >= 0; --z) {
      final long m = n - z * z;
      long xl = Functions.SQRT.l(m / 2);
      while (2 * xl * xl < m) {
        ++xl;
      }
      if (xl - z >= b) {
        break;
      }
      for (long x = xl; x <= Functions.SQRT.l(m); ++x) {
        if (x - z >= b) {
          break;
        }
        final long y2 = m - x * x;
        if (Predicates.SQUARE.is(y2) && Functions.SQRT.l(y2) >= z) {
          b = x - z;
          break;
        }
      }
    }
    return b;
  }

  @Override
  public Z next() {
    while (true) {
      if (isSum3(++mN)) {
        final long s = s3(mN);
        if (s > mBest) {
          mBest = s;
          return Z.valueOf(mN);
        }
      }
    }
  }
}

