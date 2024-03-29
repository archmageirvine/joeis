package irvine.oeis.a054;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x)*(x^3-1)*(x^5-1)*(x^7-1)/(x^16-2*x^15+x^12+x^10-x^4-x^6+2*x-1)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054887 Layer counting sequence for hyperbolic tessellation by cuspidal triangles of angles (Pi/3, Pi/5, Pi/7).
 * @author Georg Fischer
 */
public class A054887 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054887() {
    super(1, "[0,1,1,0,-1,-1,-1,-1,-1,0,1,1,1,1,1,0,-1,-1]", "[1,-2,0,0,1,0,1,0,0,0,-1,0,-1,0,0,2,-1]");
  }
}
