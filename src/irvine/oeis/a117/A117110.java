package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A117110 Expansion of x*(1+5*x)/((1+2*x+1)*(1-4*x)).
 * @author Georg Fischer
 */
public class A117110 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117110() {
    super(0, new long[] {0, -1, -5},
      new long[] {-1, 2, 8});
  }
}
