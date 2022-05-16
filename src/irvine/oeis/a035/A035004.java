package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A035004 Number of divisors of the n-th nonprime.
 * @author Sean A. Irvine
 */
public class A035004 extends A018252 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
