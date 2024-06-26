package irvine.oeis.a152;
// Generated by gen_seq4.pl sigman1/sigma1 at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A152761 Sum of divisors of Catalan number A000108(n).
 * @author Georg Fischer
 */
public class A152761 extends A000108 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
