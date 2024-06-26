package irvine.oeis.a193;
// Generated by gen_seq4.pl knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002523;

/**
 * A193929 Number of prime factors of n^4 + 1, counted with multiplicity.
 * @author Georg Fischer
 */
public class A193929 extends A002523 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
