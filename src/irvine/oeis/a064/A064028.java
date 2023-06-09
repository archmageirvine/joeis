package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064028 Sum of the unitary divisors of n!.
 * @author Sean A. Irvine
 */
public class A064028 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).unitarySigma();
  }
}
