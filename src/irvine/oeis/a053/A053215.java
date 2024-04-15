package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A053215 Sum of divisors of those numbers n such that n and n+1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A053215 extends A002961 {

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}
