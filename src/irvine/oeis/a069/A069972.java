package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069972 a(n) = Sum_{d|2*n,d+1|2*n} d.
 * @author Sean A. Irvine
 */
public class A069972 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (mN % (d.longValue() + 1) == 0) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

