package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054002 Number of divisors of n such that n and n-1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A054002 extends A002961 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next().add(1)).sigma0();
  }
}

