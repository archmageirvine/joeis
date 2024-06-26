package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-05-26/tablamb at 2024-05-27 00:43

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005811;
import irvine.oeis.triangle.LambdaTable;

/**
 * A227737 n occurs as many times as there are runs in binary representation of n.
 * @author Georg Fischer
 */
public class A227737 extends LambdaTable {

  private static final DirectSequence A005811 = new A005811();

  /** Construct the sequence. */
  public A227737() {
    super(1, 1, n -> new Integer[] {1, A005811.a(n).intValueExact()}, (n, k) -> Z.valueOf(n));
  }
}
