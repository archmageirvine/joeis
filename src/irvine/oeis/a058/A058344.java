package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058344 Difference between the sum of the odd aliquot divisors of n and the sum of the even aliquot divisors of n.
 * @author Sean A. Irvine
 */
public class A058344 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.longValue() != mN) {
        sum = sum.signedAdd(d.isOdd(), d);
      }
    }
    return sum;
  }
}

