package irvine.oeis.a117;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: 1/((1-x)*(1-x^2)*(1-x^3)*(1-x^4)*(1-x^5))^2
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A117487 G.f.: 1/((1-x)*(1-x^2)*(1-x^3)*(1-x^4)*(1-x^5))^2.
 * @author Georg Fischer
 */
public class A117487 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117487() {
    super(1, "[0,1]", "[1,-2,-1,2,1,2,0,-2,-6,-2,3,6,5,2,-3,-12,-3,2,5,6,3,-2,-6,-2,0,2,1,2,-1,-2,1]");
  }
}
