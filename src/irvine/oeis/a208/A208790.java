package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208790 Number of n X 2 0..2 arrays with no element equal the average of immediate neighbors vertically above, diagonally above and left, and horizontally left of it.
 * @author Georg Fischer
 */
public class A208790 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A208790() {
    super(1, "[0,6,18,4,-8]", "[1,-2,-16,-10,4]");
  }
}
