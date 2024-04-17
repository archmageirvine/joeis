package irvine.oeis.a122;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A122376 Number of prime factors (counted with multiplicity) of the smallest number with exactly n divisors.
 * @author Georg Fischer
 */
public class A122376 extends A005179 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
