package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069289 Sum of odd divisors of n &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A069289 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if ((d & 1) == 1 && d * d <= mN) {
        sum += d;
      }
    }
    return Z.valueOf(sum);
  }
}
