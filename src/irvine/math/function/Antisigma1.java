package irvine.math.function;

import irvine.math.z.Z;

/**
 * Sum of antidivisors of n.
 * @author Sean A. Irvine
 */
public class Antisigma1 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    assert n.signum() > 0;
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    Z m = n;
    int k = 0;
    while (m.and(Z.ONE).isZero()) {
      m = m.shiftRight(1);
      ++k;
    }
    return Functions.SIGMA1.z(n.multiply2().add(1))
      .add(Functions.SIGMA1.z(n.multiply2().subtract(1)))
      .add(Functions.SIGMA1.z(m).shiftLeft(k + 1))
      .subtract(n.multiply(6).add(2));
  }
}
