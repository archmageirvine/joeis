package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025058 Numbers of form i*j + j*k + k*i, where 1 &lt;=i &lt; j &lt; k, including repetitions.
 * @author Sean A. Irvine
 */
public class A025058 extends Sequence1 {

  private int mC = 0;
  private long mN = 2;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long i = 1; i <= Functions.SQRT.l(mN / 3); ++i) {
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
