package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025060 Numbers of the form i*j + j*k + k*i, where 1 &lt;= i &lt; j &lt; k.
 * @author Sean A. Irvine
 */
public class A025060 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long i = 1; i <= Functions.SQRT.l(mN / 3); ++i) {
        for (long j = i + 1; 3 * i * j <= mN; ++j) {
          final long u = mN - i * j;
          if (u % (j + i) == 0) {
            final long k = u / (j + i);
            if (k > j) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
