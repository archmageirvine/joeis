package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054002 Number of divisors of n such that n and n-1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A054002 extends A002961 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().add(1));
  }
}

