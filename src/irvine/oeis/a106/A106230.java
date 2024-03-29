package irvine.oeis.a106;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (3-x-12*x^2+20*x^3-8*x^4)/(1-x)^3
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A106230 Least k &gt; 0 for n &gt; 0 such that (n^2 + 1)*(k^2) + (n^2 + 1)*k + 1 = j^2 where j sequence = A106229.
 * @author Georg Fischer
 */
public class A106230 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A106230() {
    super(1, "[0,3,-1,-12,20,-8]", "[1,-3,3,-1]");
  }
}
