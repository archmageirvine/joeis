package irvine.oeis.a369;
// Generated by gen_seq4.pl robots/lingf at 2024-02-11 21:11

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A369843 Number of compositions of 5*n-3 into parts 2 and 5.
 * @author Georg Fischer
 */
public class A369843 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A369843() {
    super(1, "[0, 1, -3, 3, -1]", "[1, -5, 9, -10, 5, -1]");
  }
}
