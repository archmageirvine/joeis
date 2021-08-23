package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051002 Sum of 5th powers of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A051002 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(d.pow(5));
      }
    }
    return sum;
  }
}
