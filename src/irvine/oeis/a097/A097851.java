package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A097851 G.f.: (1+x^8+x^9+x^10+x^18)/((1-x^2)*(1-x^3)*(1-x^4)*(1-x^5)*(1-x^6)*(1-x^7)).
 * @author Georg Fischer
 */
public class A097851 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097851() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, 0, -1, -1, -1, 0, 0, 1, 2, 2, 1, 0, -2, -2, -2, -2, 0, 
      1, 2, 2, 1, 0, 0, -1, -1, -1, 0, 1});
  }
}
