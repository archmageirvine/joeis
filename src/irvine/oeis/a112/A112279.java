package irvine.oeis.a112;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(-100*x^7-125*x^6-30*x^5-11*x^4-5*x^3-3*x^2-2*x-1)/(x^5-1)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A112279 a(1)=1; a(n)=prime(mod(a(n-1),100)).
 * @author Georg Fischer
 */
public class A112279 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A112279() {
    super(1, "[0,1,2,3,5,11,30,125,100]", "[1,0,0,0,0,-1]");
  }
}
