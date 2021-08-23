package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051000 Sum of cubes of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A051000 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(d.pow(3));
      }
    }
    return sum;
  }
}
