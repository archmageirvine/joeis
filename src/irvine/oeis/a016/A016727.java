package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016727.
 * @author Sean A. Irvine
 */
public class A016727 implements Sequence {

  // Cf. A000164.

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    final long s = ++mN * mN;
    for (long i = 0; i <= mN; ++i) {
      final long is = i * i;
      final long jlim = LongUtils.sqrt(s - is);
      for (long j = i; j <= jlim; ++j) {
        final long js = is + j * j;
        final long rs = s - js;
        final long r = LongUtils.sqrt(rs);
        if (r >= j && r * r == rs) {
          ++c;
        }
      }
    }
    return Z.valueOf(c);
  }
}

