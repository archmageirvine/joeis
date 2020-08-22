package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008332 Sum of divisors of p-1, p prime.
 * @author Sean A. Irvine
 */
public class A008332 extends A006093 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma();
  }
}


