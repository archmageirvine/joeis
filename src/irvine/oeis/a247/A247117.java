package irvine.oeis.a247;
// Generated by gen_seq4.pl maprep/lingf at 2023-12-20 12:48

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A247117 Number of tilings of a 10 X n rectangle using 2n pentominoes of shape I.
 * @author Georg Fischer
 */
public class A247117 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A247117() {
    super(0, "[1, 0, 0,-1,-1,-6,-1, 0, 5, 4, 15, 4, 0,-10,-6,-20,-6, 0, 10, 4, 15, 4, 0,-5,-1,-6,-1, 0, 1, 0, 1]", "[1,-1, 0,-1, 0,-12, 3,-1, 10, 6, 33, 4, 4,-19,-8,-45,-10,-6, 20, 12, 39, 15, 4,-15,-8,-22,-9,-1, 6, 2, 7, 2, 0,-1, 0,-1]");
  }
}
