package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049239 Smallest nonnegative value taken on by px^2-qy^2 for an infinite number of integer pairs (x,y), where (p,q) = (1,1), (1,2), (2,1), (1,3), (2,2), (3,1)...
 * @author Sean A. Irvine
 */
public class A049239 implements Sequence {

  // WARNING: DO NOT USE THIS TO EXTEND THE SEQUENCE

  private static final long HEURISTIC = 1000;
  private long mN = 0;
  private long mM = 0;

  private boolean isSolution(final long p, final long q, final long z, final long limit) {
    for (int y = 1; y < limit; ++y) {
      final long r = z + q * y * y;
      for (long x = 1; true; ++x) {
        final long px2 = p * x * x;
        if (px2 >= r) {
          if (px2 == r) {
            return true;
          }
          break;
        }
      }
    }
    return false;
  }

  protected long f(final long p, final long q, final long limit) {
    final long d = LongUtils.gcd(p, q);
    long z = 0;
    while (true) {
      if (isSolution(p, q, z, limit)) {
        return z;
      }
      z += d;
    }
  }

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Z.valueOf(f(mN - mM + 1, mM, HEURISTIC));
  }
}
