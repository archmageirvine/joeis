package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a019.A019505;

/**
 * A020697 Number of divisors of A019505(n).
 * @author Sean A. Irvine
 */
public class A020697 extends A019505 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}
