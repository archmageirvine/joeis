package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069292 Sum of square roots of square divisors of n &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A069292 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      if (dd.isSquare()) {
        final long d = dd.longValue();
        if (d * d <= mN) {
          sum += Functions.SQRT.l(d);
        }
      }
    }
    return Z.valueOf(sum);
  }
}
