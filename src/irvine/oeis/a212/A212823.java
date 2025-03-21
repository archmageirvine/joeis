package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A212823 Number of 0..2 arrays of length n with no adjacent pair equal to its immediately preceding adjacent pair, and new values introduced in 0..2 order.
 * @author Georg Fischer
 */
public class A212823 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A212823() {
    super(1, "[0,1,0,-1,-2,-1]", "[1,-2,-2]");
  }
}
