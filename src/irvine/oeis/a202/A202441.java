package irvine.oeis.a202;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202441 Number of (n+2) X 4 binary arrays avoiding patterns 001 and 110 in rows, columns and nw-to-se diagonals.
 * @author Georg Fischer
 */
public class A202441 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A202441() {
    super(1, "[0,138,-188,-26,174,-96,14]", "[1,-3,2,2,-3,1]");
  }
}
