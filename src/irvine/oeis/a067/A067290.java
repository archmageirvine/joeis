package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067290 Numbers n such that prime(n)&lt;n*tau(n) where tau(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A067290 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(Jaguar.factor(++mN).sigma0().multiply(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
