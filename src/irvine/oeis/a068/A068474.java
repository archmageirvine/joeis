package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068445.
 * @author Sean A. Irvine
 */
public class A068474 extends A000040 {

  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(super.next().subtract(1).divide2()).equals(Jaguar.factor(++mN).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
