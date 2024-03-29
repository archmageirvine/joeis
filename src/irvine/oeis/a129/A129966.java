package irvine.oeis.a129;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (-x^2*(x^2+1)*(x^8+2*x^7+11*x^6+4*x^5-4*x^4+4*x^3+11*x^2+2*x+1))/((1+x)^2*(1+x+x^2)^2*(x^2-x+1)^2*(x-1)^3)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A129966 Triangular numbers which are differences of squares.
 * @author Georg Fischer
 */
public class A129966 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A129966() {
    super(1, "[0,0,1,2,12,6,7,8,7,6,12,2,1]", "[1,-1,0,0,0,0,-2,2,0,0,0,0,1,-1]");
  }
}
