package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048671 a(n) is the least common multiple of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A048671 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        lcm = lcm.lcm(d);
      }
    }
    return lcm;
  }
}
