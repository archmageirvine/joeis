package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A212834 Number of 0..7 arrays of length n+1 with 0 never adjacent to 7.
 * @author Georg Fischer
 */
public class A212834 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A212834() {
    super(1, "[0,62,48]", "[1,-7,-6]");
  }
}
