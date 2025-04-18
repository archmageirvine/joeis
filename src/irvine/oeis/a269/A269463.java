package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269463 Number of length-n 0..4 arrays with no repeated value equal to the previous repeated value.
 * @author Georg Fischer
 */
public class A269463 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269463() {
    super(1, "[0,5,-10,-35]", "[1,-7,4,32]");
  }
}
