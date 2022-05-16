package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A024710 Greatest prime divisor of A024702(n).
 * @author Sean A. Irvine
 */
public class A024710 extends A024702 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z[] factors = Jaguar.factor(super.next()).toZArray();
    return factors[factors.length - 1];
  }
}
