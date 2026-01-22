package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392257 Smallest value of rad(t*(n-t)) where t is coprime to n and in the range 1 &lt;= t &lt;= n/2 where rad = A007947.
 * @author Sean A. Irvine
 */
public class A392257 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long min = Long.MAX_VALUE;
    for (long t = 1; t <= mN / 2; ++t) {
      if (Functions.GCD.l(t, mN) == 1) {
        final long r = Functions.RAD.l(t * (mN - t));
        if (r < min) {
          min = r;
        }
      }
    }
    return Z.valueOf(min);
  }
}
