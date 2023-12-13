package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067289 Numbers k such that the number of divisors of k is floor(prime(k)/k).
 * @author Sean A. Irvine
 */
public class A067289 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().divide(++mN).equals(Jaguar.factor(mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
