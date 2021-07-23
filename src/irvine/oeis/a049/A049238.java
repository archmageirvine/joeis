package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049238 a(n) is the number of divisors of prime(n) - 2.
 * @author Sean A. Irvine
 */
public class A049238 extends A000040 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Cheetah.factor(super.next().subtract(2)).sigma0();
  }
}
