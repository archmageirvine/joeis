package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A024710 Greatest prime divisor of <code>A024702(n)</code>.
 * @author Sean A. Irvine
 */
public class A024710 extends A024702 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z[] factors = Cheetah.factor(super.next()).toZArray();
    return factors[factors.length - 1];
  }
}
