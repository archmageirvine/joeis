package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000177.
 * @author Sean A. Irvine
 */
public class A000177 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    final long sqrt = LongUtils.sqrt(++mN);
    for (long i = 0; i <= sqrt; ++i) {
      final long is = i * i;
      final long jlim = LongUtils.sqrt(mN - is);
      for (long j = i; j <= jlim; ++j) {
        final long js = is + j * j;
        final long klim = LongUtils.sqrt(mN - js);
        for (long k = j; k <= klim; ++k) {
          final long ks = js + k * k;
          final long llim = LongUtils.sqrt(mN - ks);
          for (long l = k; l <= llim; ++l) {
            final long ls = ks + l * l;
            final long mlim = LongUtils.sqrt(mN - ls);
            for (long m = l; m <= mlim; ++m) {
              final long ms = ls + m * m;
              final long rs = mN - ms;
              final long r = LongUtils.sqrt(rs);
              if (r >= m && r * r == rs) {
                ++c;
              }
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

