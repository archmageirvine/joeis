package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064873 First of four sequences representing the lexicographical minimal decomposition of n in 4 squares: n = a(n)^2 + A064874(n)^2 + A064875(n)^2 + A064876(n)^2.
 * @author Sean A. Irvine
 */
public class A064873 extends Sequence0 {

  private long mN = -1;

  protected Z select(final long n, final long a, final long b, final long c, final long d) {
    return Z.valueOf(a);
  }

  @Override
  public Z next() {
    ++mN;
    for (long a = 0; true; ++a) {
      final long u = mN - a * a;
      for (long b = a; 3 * b * b <= u; ++b) {
        final long v = u - b * b;
        for (long c = b; 2 * c * c <= v; ++c) {
          final long w = v - c * c;
          if (Predicates.SQUARE.is(w)) {
            return select(mN, a, b, c, LongUtils.sqrt(w));
          }
        }
      }
    }
  }
}

