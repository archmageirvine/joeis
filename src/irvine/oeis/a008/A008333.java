package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A008333 Sum of divisors of <code>p+1</code>, p prime.
 * @author Sean A. Irvine
 */
public class A008333 extends A008864 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma();
  }
}


