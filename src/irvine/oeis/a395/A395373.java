package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395373 Triangle read by rows: T(n, k) is the number of ordered pairs (x,y) with 1 &lt;= x,y &lt;= n such that x*y = k, for 1 &lt;= k &lt;= n^2.
 * @author Sean A. Irvine
 */
public class A395373 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 1;
    }
    long cnt = 0;
    for (final Z dd : Jaguar.factor(mM).divisors()) {
      final long d = dd.longValue();
      if (d <= mN && mM / d <= mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
