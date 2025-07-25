package irvine.oeis.a236;
// Generated by gen_seq4.pl 2025-07-17.ack/lingf at 2025-07-18 00:03

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A236582 The number of tilings of an 8 X n floor with 1 X 4 tetrominoes.
 * @author Georg Fischer
 */
public class A236582 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A236582() {
    super(0, "[1,0,-1,-1,-4,0,4,3,6,0,-6,-3,-4,0,4,1,1,0,-1]", "[1,-1,-1,0,-9,2,8,5,16,0,-13,-6,-13,-2,10,6,6,1,-5,-2,-1,0,1]");
  }
}
