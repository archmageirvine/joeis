package irvine.oeis.a370;
// Generated by gen_seq4.pl fract1/lingf at 2024-02-27 14:16

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A370051 Expansion of (1-5*x+6*x^2-x^3)/(1-9*x+28*x^2-35*x^3+15*x^4-x^5).
 * @author Georg Fischer
 */
public class A370051 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A370051() {
    super(0, "[1, -5, 6, -1]", "[1, -9, 28, -35, 15, -1]");
  }
}
