package irvine.oeis.a129;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;

/**
 * A129987 Third differences of A129983.
 * @author Georg Fischer
 */
public class A129987 extends DifferenceSequence {

  /** Construct the sequence. */
  public A129987() {
    super(new DifferenceSequence(new DifferenceSequence(new A129983())));
  }
}
