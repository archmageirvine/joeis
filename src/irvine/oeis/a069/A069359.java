package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A069359 a(n) = n * Sum_{p|n} 1/p where p are primes dividing n.
 * @author Sean A. Irvine
 */
public class A069359 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      sum = sum.add(mN / p.longValue());
    }
    return sum;
  }
}
