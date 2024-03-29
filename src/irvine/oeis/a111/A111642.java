package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A111642 Expansion of 2*(x-1)*(x+1)/((x^2+4*x+1)*(x^2-2*x-1)).
 * @author Georg Fischer
 */
public class A111642 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111642() {
    super(0, new long[] {-2, 0, 2},
      new long[] {-1, -6, -8, 2, 1});
  }
}
