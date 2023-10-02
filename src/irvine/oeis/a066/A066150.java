package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A066150 Maximal number of divisors of any n-digit number.
 * @author Sean A. Irvine
 */
public class A066150 extends A066151 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
