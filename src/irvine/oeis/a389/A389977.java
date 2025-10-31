package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389977 Absolute value of the inverse Mobius transform of n*mu(n)*sigma(n).
 * @author Sean A. Irvine
 */
public class A389977 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      prod = prod.multiply(p.square().add(p).subtract(1));
    }
    return prod;
  }
}

