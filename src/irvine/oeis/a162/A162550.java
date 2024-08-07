package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-05-26/tablamb at 2024-05-27 00:43

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A162550 2n repeated C_n times, where C_n = A000108(n) is a Catalan number.
 * @author Georg Fischer
 */
public class A162550 extends LambdaTable {

  /** Construct the sequence. */
  public A162550() {
    super(0, 0, n -> new Integer[] {1, Functions.CATALAN.i(n)}, (n, k) -> Z.valueOf(2L * n));
  }
}
