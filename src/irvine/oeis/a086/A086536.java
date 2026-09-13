package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086536 Least common multiple of numbers obtained by adding one to the odd divisors of n and subtracting 1 from the even divisors of n.
 * @author Sean A. Irvine
 */
public class A086536 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod = prod.lcm(d.add(d.isEven() ? -1 : 1));
    }
    return prod;
  }
}
