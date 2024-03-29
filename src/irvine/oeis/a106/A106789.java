package irvine.oeis.a106;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: 2*(5-5*x+4*x^2-18*x^3-x^4-5*x^5)/((1+x+x^2-x^3)*(1-3*x-x^2-x^3))
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A106789 Sum of two consecutive squares of Lucas 3-step numbers (A001644).
 * @author Georg Fischer
 */
public class A106789 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A106789() {
    super(0, "[10,-10,8,-36,-2,-10]", "[1,-2,-3,-6,1,0,1]");
  }
}
