package irvine.oeis.a130;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1-12*x^11+11*x^12)/((1-x^12)*(1-x)^3)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A130490 a(n) = Sum_{k=0..n} (k mod 12) (Partial sums of A010881).
 * @author Georg Fischer
 */
public class A130490 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A130490() {
    super(0, "[0,1,0,0,0,0,0,0,0,0,0,0,-12,11]", "[1,-3,3,-1,0,0,0,0,0,0,0,0,-1,3,-3,1]");
  }
}
