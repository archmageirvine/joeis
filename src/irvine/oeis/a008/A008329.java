package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A008329 Number of divisors of p+1, p prime.
 * @author Sean A. Irvine
 */
public class A008329 extends A008864 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}


