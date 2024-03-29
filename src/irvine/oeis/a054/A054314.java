package irvine.oeis.a054;
// Generated by gen_seq4.pl posins at 2021-05-28 23:02
// DO NOT EDIT here!

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001620;


/**
 * A054314 Positions of 8's in the decimal expansion of Euler's constant.
 *
 * @author Georg Fischer
 */
public class A054314 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054314() {
    super(1, 1, new A001620(), 8);
  }
}
