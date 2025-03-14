package irvine.oeis.a207;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A207455 Number of 4 X n 0..1 arrays avoiding 0 0 0 and 0 0 1 horizontally and 0 0 1 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A207455 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A207455() {
    super(1, "[0,8,56,24,-72]", "[1,-1,-10,-3,9]");
  }
}
