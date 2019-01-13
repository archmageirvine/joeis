package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A000374.
 * @author Sean A. Irvine
 */
public class A000374 implements Sequence {

  private Z mN = Z.ZERO;

  private long ord2(final Z d) {
    if (Z.ONE.equals(d)) {
      return 1;
    }
    Z z = Z.TWO.mod(d);
    long k = 1;
    while (!Z.ONE.equals(z)) {
      z = z.modMultiply(Z.TWO, d);
      ++k;
    }
    return k;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z m = mN.makeOdd();
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(m).divisors()) {
      sum = sum.add(Euler.phi(d).divide(ord2(d)));
    }
    return sum;
  }
}
