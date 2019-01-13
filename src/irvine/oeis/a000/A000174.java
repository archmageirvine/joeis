package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000174.
 * @author Sean A. Irvine
 */
public class A000174 implements Sequence {

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
            final long rs = mN - ls;
            final long r = LongUtils.sqrt(rs);
            if (r >= l && r * r == rs) {
              ++c;
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

