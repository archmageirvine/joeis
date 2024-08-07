package irvine.oeis.a111;
// Generated by gen_seq4.pl 2024-05-26/tablamb at 2024-05-27 00:43

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A111652 3n appears n times.
 * @author Georg Fischer
 */
public class A111652 extends LambdaTable {

  /** Construct the sequence. */
  public A111652() {
    super(1, 1, n -> new Integer[] {1, n}, (n, k) -> Z.valueOf(3L * n));
  }
}
