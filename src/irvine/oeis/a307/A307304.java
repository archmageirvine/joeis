package irvine.oeis.a307;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -x^2*(x^2+1)*(x^2+x+1)/((x+1)^2*(x-1)^5)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A307304 Number of inequivalent ways of placing 2 nonattacking rooks on n X n board up to rotations and reflections of the board.
 * @author Georg Fischer
 */
public class A307304 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A307304() {
    super(1, "[0,0,1,1,2,1,1]", "[1,-3,1,5,-5,-1,3,-1]");
  }
}
