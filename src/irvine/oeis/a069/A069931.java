package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069931 Number of k, 1&lt;=k&lt;=n, such that k divides sigma(n).
 * @author Sean A. Irvine
 */
public class A069931 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long count = 0;
    for (final Z d : Jaguar.factor(Functions.SIGMA.z(++mN)).divisors()) {
      if (d.longValueExact() <= mN) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
