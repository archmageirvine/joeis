package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269534 Number of length-n 0..5 arrays with no repeated value differing from the previous repeated value by other than one.
 * @author Georg Fischer
 */
public class A269534 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269534() {
    super(1, "[0,6,-66,150,376,-774,-1642,-708]", "[1,-17,92,-96,-493,533,1521,695]");
  }
}
