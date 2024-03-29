package irvine.oeis.a369;
// Generated by gen_seq4.pl fract1/lingf at 2024-02-27 14:16

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A369804 Expansion of 1/(1 - x^3/(1-x)^5).
 * @author Georg Fischer
 */
public class A369804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A369804() {
    super(0, "[1, -5, 10, -10, 5, -1]", "[1, -5, 10, -11, 5, -1]");
  }
}
