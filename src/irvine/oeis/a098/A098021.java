package irvine.oeis.a098;
// Generated by gen_seq4.pl posins at 2020-06-21 23:01
// DO NOT EDIT here!

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a187.A187967;


/**
 * A098021 Positions of 0's in the zero-one sequence [nr+2r]-[nr]-[2r], where r=sqrt(2) and [ ]=floor; see A187967.
 * @author Georg Fischer
 */
public class A098021 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A098021() {
    super(1, new A187967(), 0);
  }
}
