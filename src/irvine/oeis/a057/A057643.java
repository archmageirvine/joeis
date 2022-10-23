package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057643 Least common multiple of all (k+1)'s, where the k's are the positive divisors of n.
 * @author Sean A. Irvine
 */
public class A057643 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      lcm = lcm.lcm(d.add(1));
    }
    return lcm;
  }
}
