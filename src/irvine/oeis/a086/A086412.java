package irvine.oeis.a086;
// Generated by gen_seq4.pl knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A086412 Number of distinct prime factors of 3-smooth numbers.
 * @author Georg Fischer
 */
public class A086412 extends A003586 {
  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
