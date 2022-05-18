package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a019.A019505;

/**
 * A020697 Number of divisors of A019505(n).
 * @author Sean A. Irvine
 */
public class A020697 extends A019505 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
