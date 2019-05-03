package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000164 Number of partitions of n into 3 squares (allowing part <code>zero)</code>.
 * @author Sean A. Irvine
 */
public class A000164 implements Sequence {

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
        final long rs = mN - js;
        final long r = LongUtils.sqrt(rs);
        if (r >= j && r * r == rs) {
          ++c;
        }
      }
    }
    return Z.valueOf(c);
  }
}

