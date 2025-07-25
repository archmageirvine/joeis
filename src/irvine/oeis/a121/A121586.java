package irvine.oeis.a121;
// Generated by gen_seq4.pl 2025-06-28.ack/lambdan at 2025-06-28 22:36

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A121586 Number of columns in all deco polyominoes of height n. A deco polyomino is a directed column-convex polyomino in which the height, measured along the diagonal, is attained only in the last column.
 * @author Georg Fischer
 */
public class A121586 extends LambdaSequence {

  /** Construct the sequence. */
  public A121586() {
    super(0, n -> Functions.FACTORIAL.z(n + 1).subtract(Functions.STIRLING1.z(n + 1, 2).abs()));
  }
}
