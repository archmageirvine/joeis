package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028887 Theta series of 4-dimensional 5-modular lattice with det 25 and minimal norm 2.
 * @author Sean A. Irvine
 */
public class A028887 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.mod(5) != 0) {
        sum = sum.add(d);
      }
    }
    return sum.multiply(6);
  }
}
