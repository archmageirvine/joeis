package irvine.oeis.a321;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321546 <code>a(n) =</code> Sum_{d|n} (-1)^(d-1)*d^7.
 * @author Sean A. Irvine
 */
public class A321546 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.signedAdd(!d.isEven(), d.pow(7));
    }
    return sum;
  }
}
