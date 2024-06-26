package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-05-26/tablamb at 2024-05-27 00:43

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A162988 n appears A008578(n) times.
 * @author Georg Fischer
 */
public class A162988 extends LambdaTable {

  /** Construct the sequence. */
  public A162988() {
    super(1, 1, n -> new Integer[] {1, n == 1 ? 1 : Functions.PRIME.i(n - 1)}, (n, k) -> Z.valueOf(n));
  }
}
