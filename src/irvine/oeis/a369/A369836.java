package irvine.oeis.a369;
// Generated by gen_seq4.pl robots/lingf at 2024-02-11 21:11

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A369836 Number of compositions of 5*n into parts 1 and 5.
 * @author Georg Fischer
 */
public class A369836 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A369836() {
    super(0, "[1, -4, 6, -4, 1]", "[1, -6, 10, -10, 5, -1]");
  }
}
