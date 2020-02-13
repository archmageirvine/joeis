package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028887.
 * @author Sean A. Irvine
 */
public class A028887 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (d.mod(5) != 0) {
        sum = sum.add(d);
      }
    }
    return sum.multiply(6);
  }
}
