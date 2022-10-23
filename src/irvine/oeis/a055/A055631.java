package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055631 Sum of Euler's totient function phi of distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A055631 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      sum = sum.add(p.subtract(1));
    }
    return sum;
  }
}
