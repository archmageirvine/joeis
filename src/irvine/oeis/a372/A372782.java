package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-07-11/lingf at 2024-07-11 18:00

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A372782 Least number m for which there exists some positive k &lt; m where the sum of the integers from k + 1 to m inclusive is an n-th power &gt; 1.
 * @author Georg Fischer
 */
public class A372782 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A372782() {
    super(1, "[0, 2, 2, -3]", "[1, -1, -3, 3]");
  }
}
