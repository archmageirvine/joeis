package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-02.ack/lingf at 2024-10-02 22:45

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A376080 a(n) is the highest degree of the rational function in the recursive substitution {y1, y2} -&gt; {y2, (y2 + 1)/(y1*y2)} after n steps.
 * @author Georg Fischer
 */
public class A376080 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A376080() {
    super(0, "[1, -1, 0, 1, 1, -1, 1, 0, 1]", "[1, -2, 1, 0, 0, 0, 0, -1, 2, -1]");
  }
}
