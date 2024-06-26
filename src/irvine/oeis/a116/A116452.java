package irvine.oeis.a116;
// Generated by gen_seq4.pl knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A116452 Number of prime factors of A116451.
 * @author Georg Fischer
 */
public class A116452 extends A116451 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
