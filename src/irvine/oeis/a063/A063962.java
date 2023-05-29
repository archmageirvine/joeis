package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063962 Number of distinct prime divisors of n that are &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A063962 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      final long q = p.longValue();
      if (q * q <= mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

