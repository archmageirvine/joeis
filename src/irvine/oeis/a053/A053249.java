package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A053249 Number of divisors of k, where k and k+1 have the same sum of divisors (A002961).
 * @author Sean A. Irvine
 */
public class A053249 extends A002961 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
