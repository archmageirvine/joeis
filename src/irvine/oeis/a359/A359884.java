package irvine.oeis.a359;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A359884 Number of 3-dimensional tilings of a 2 X 2 X n box using 2 X 2 X 1 plates and 1 X 2 X 1 dominos.
 * @author Georg Fischer
 */
public class A359884 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A359884() {
    super(0, "[1,-2]", "[1,-5,-9,14]");
  }
}
