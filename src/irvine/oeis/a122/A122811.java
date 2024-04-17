package irvine.oeis.a122;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a038.A038547;

/**
 * A122811 Number of prime factors (counted with multiplicity) of the smallest odd number with exactly n divisors.
 * @author Georg Fischer
 */
public class A122811 extends A038547 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
