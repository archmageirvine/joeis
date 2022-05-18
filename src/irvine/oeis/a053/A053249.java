package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A053249 Number of divisors of n such that n and n+1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A053249 extends A002961 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
