package irvine.oeis.a080;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+3*x+x^2)/((1-x^2)^2)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A080512 a(n) = n if n is odd, a(n) = 3*n/2 if n is even.
 * @author Georg Fischer
 */
public class A080512 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A080512() {
    super(1, "[0,1,3,1]", "[1,0,-2,0,1]");
  }
}
