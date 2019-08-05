package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025058 Numbers of form <code>i*j + j*k + k*i</code>, where <code>1 &lt;=i &lt; j &lt</code>; k, including repetitions.
 * @author Sean A. Irvine
 */
public class A025058 implements Sequence {

  private int mC = 0;
  private long mN = 2;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long i = 1; i <= LongUtils.sqrt(mN / 3); ++i) {
        for (long j = i + 1; 3 * i * j <= mN; ++j) {
          final long u = mN - i * j;
          if (u % (j + i) == 0) {
            final long k = u / (j + i);
            if (k > j) {
              ++mC;
            }
          }
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}
